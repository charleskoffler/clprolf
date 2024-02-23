package org.simol.snake_game;

/* could be seen as a simu_real_world_obj of a mathematical set object. */
import java.util.ArrayList;
/* could be seen as a simu_real_world_obj of an expert. */
import java.util.Random;

import org.simol.simolframework.java.Long_action;
import org.simol.simolframework.java.Prevent_missing_collision;
import org.simol.simolframework.java.Model_real_world_obj;
import org.simol.simolframework.java.Simu_real_world_obj;
import org.simol.simolframework.java.Underst;


@Simu_real_world_obj
public class Snake  {
	public static int LINKS_NUMBER = 20;
	public static int SPEED_STEP = 4; /* Three speed-gears with step of 4. */
	public static int NB_SPEED_GEARS = 4;

	protected int speed;
	
	public int getSpeed() {
		return speed;
	}

	protected SnakeGameLifeScene lifeScene;
	protected SlidingType lastSlidingType;
	
	public void setLastSlidingType(SlidingType lastSlidingType) {
		this.lastSlidingType = lastSlidingType;
	}

	public static enum LinkTypeEnum {
		HEAD_LINK,
		FIRST_LINK,
		SECOND_LINK
	}
	public static enum SlidingType {
		UP_SLIDING,
		DOWN_SLIDING,
		LEFT_SLIDING,
		RIGHT_SLIDING,
		STOPPED
	}
	
	// public real_world_obj SnakeLink
	@Model_real_world_obj
	public static class SnakeLink {
		public int x;
		public int y;
		public LinkTypeEnum typeLink;
	}
	// Accessors
	private ArrayList<SnakeLink> links;
	public ArrayList<SnakeLink> getLinks() {
		return links;
	}

	public void setLinks(ArrayList<SnakeLink> links) {
		this.links = links;
	}

	private String color;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	/**
	 * true value for stopping thread.
	 */
	private boolean blnHalt;
	
	public boolean isBlnHalt() {
		return blnHalt;
	}

	public void setBlnHalt(boolean blnHalt) {
		this.blnHalt = blnHalt;
	}

	//
	
	public Snake(SnakeGameLifeScene lifeScene, int startY, String color) {
		this.lifeScene = lifeScene;
		this.blnHalt = false;
		this.speed = 10;
		links = new ArrayList<SnakeLink>();
		constructSnakeLinks(startY);
		this.lastSlidingType = SlidingType.STOPPED;
		this.color = color;
	}
	
	private void constructSnakeLinks(int startY) {
		Random rand = new Random();
		
		for (int i=0; i<Snake.LINKS_NUMBER; i++) {
			int randomForLink;
			SnakeLink link = new SnakeLink();
			
			link.x = Snake.LINKS_NUMBER-i-1;
			link.y = startY;
			
			//Choice of link type. Link 0 = Head, random is used for the others.
			if (i!=0) {
				randomForLink = rand.nextInt(2);
				if (randomForLink==0) {
					link.typeLink = LinkTypeEnum.FIRST_LINK;
				}
				else {
					link.typeLink = LinkTypeEnum.SECOND_LINK;
				}
			}
			else {
				link.typeLink = LinkTypeEnum.HEAD_LINK;
			}
			this.links.add(link);
		}
	}
	
	private Snake findOtherSnake() {
		Snake autreChenille=null;
		
		if (this==this.lifeScene.getSnake()) {
			autreChenille = this.lifeScene.getSnake_two();
		}
		else if (this==this.lifeScene.getSnake_two()){
			autreChenille = this.lifeScene.getSnake();
		}
		return autreChenille;
	}
	
	/**
	 * Never called in our case!!!
	 */
	@Long_action
	public void makeSliding() {
		//We do not need makeSliding() in this game, because the snake is always sliding!
		//
		//Example for a falling() long action: it's the trigger of the long action,
		//which would call continueFalling(), for example, and setting the isFalling boolean to true before.
		// There would be a @Long_action boolean associated attribute "isFalling",
		//, checked by continueFalling(), and initialized to true at the trigger by falling().
		//Later, at regular interval of time, the programmer just have to call endLongActions()
		//method of the class, which call all the continue() methods of the class, during the
		//correct chosen intervals of time, until the duration is passed. Then the isFalling
		//boolean would be set to false!
	}
	
	/**
	 * Make slide the snake if we can(no wall, or no meet of our self body). Return true, except if
	 * there's a collision with another snake.
	 * @param slidingType
	 * @return true if the sliding was made, or if we bit ourselves. False if we bit another snake.
	 */
	//we used an 'underst', because it seems hard coding this.
	//There is only one step for a whole sliding of the snake. The "Long action" is here because the snakes
	// are continuously sliding!
	//The method is not directly called. It is called either by makeSliding() at the trigger of the action,
	//either by endLongActions().
	//
	//"@Prevent_missing_collision" is here to indicate that we check, for example, here, a collision
	//with the other snake, before accepting the move. If we don't do this here, but later, we could
	//miss a collision, if a snake cross paths with the other snake. This could theoretically happen,
	//but perhaps not in the case of two snakes!
	@Underst
	@Long_action
	@Prevent_missing_collision
	protected void continueMakeSliding() {
		if (this.lastSlidingType == SlidingType.STOPPED) return; //We're doing nothing in that case!
		SnakeLink newHeadLink = new SnakeLink(), presentHead = this.links.get(0);
		SnakeLink presentLink;
		Snake otherSnake=null;
		//When we bit ourselves, we can not bit our first link, because it is detected before.
		Food existingFood = null;
		
		//Snake distinction
		otherSnake = this.findOtherSnake();
		
		//Head moving
		switch (lastSlidingType) {
			case UP_SLIDING:
				newHeadLink.x = presentHead.x;
				newHeadLink.y = presentHead.y - 1;
			
				break;
			case DOWN_SLIDING:
				newHeadLink.x = presentHead.x;
				newHeadLink.y = presentHead.y + 1;
				
				break;
			case LEFT_SLIDING:
				newHeadLink.x = presentHead.x - 1;
				newHeadLink.y = presentHead.y;
				
				break;
			case RIGHT_SLIDING:
				newHeadLink.x = presentHead.x + 1;
				newHeadLink.y = presentHead.y;
			case STOPPED:	
				break;
			default:
				break;
		}
		//Snake otherSnake=null;
		
		//When we bit ourselves, we can not bit our first link, because it is detected before.
		boolean blnBitesOther=false, blnBiteOurselv=false, blnWall=false;
		
		//Snake distinction
		otherSnake = this.findOtherSnake();
		
		blnBitesOther = existingLink(newHeadLink.x, newHeadLink.y, otherSnake) != null;
		presentLink = existingLink(newHeadLink.x, newHeadLink.y, this);
		blnBiteOurselv = (presentLink != null);
		
		existingFood = this.lifeScene.getFoodExpert().checkFoodExistence(newHeadLink.x, newHeadLink.y);
		blnWall = newHeadLink.y<0 || newHeadLink.y>SnakeGameLifeScene.SCENE_ROWS_COUNT-1
		|| newHeadLink.x<0 || newHeadLink.x>SnakeGameLifeScene.SCENE_COLUMNS_COUNT-1;
		if (blnWall || blnBiteOurselv || blnBitesOther) {
			this.lifeScene.getRealiz().reactToGameOver(this);
		}
		
		//We can slide.
		//Rest of body moving, when sliding
		for (int i=this.links.size()-1; i>=1; i--) {
			SnakeLink currentLink, previousLink;
			currentLink = this.links.get(i);
			previousLink = this.links.get(i-1);
			
			currentLink.y = previousLink.y;
			currentLink.x = previousLink.x;
		}
		
		//The head is moving
		presentHead.x = newHeadLink.x;
		presentHead.y = newHeadLink.y;
		
		//
		// potential extension of the tail.
		if (existingFood!=null) {
			this.lifeScene.getFoodExpert().getFoodList().remove(existingFood);
			this.makeGrowSnake();
		}
		
	}
	
	/**
	 * Make growing the snake in a random direction, among available extension places.
	 * We return false, and do nothing, if we can make grow the snake.
	 * @return
	 */
	//Not so hard to code, so we didn't mentioned 'underst'. But it's subjective.
	private boolean makeGrowSnake() {
		SnakeLink lastLink, newLink;
		Random randomExpert = new Random();
		int randomNumber, newX=-1, newY=-1;
		
		Snake otherSnake;
		ArrayList<SnakeGameLifeScene.Place> listOfFreePlaces = new ArrayList<SnakeGameLifeScene.Place>();
		
		otherSnake = this.findOtherSnake();
		lastLink = this.links.get(this.links.size()-1);
		
		//FOr directions analysis, and we keep free places.
		for (int i=0;i<4;i++) {
			SnakeGameLifeScene.Place freePlace;
			
			switch(i) {
			
				case 0: //On the left
					newX = lastLink.x-1;
					newY = lastLink.y;
					break;
				
				case 1: //On the right
					newX = lastLink.x+1;
					newY = lastLink.y;
					break;
					
				case 2: //Down
					newX = lastLink.x;
					newY = lastLink.y+1;
					break;
					
				case 3: //Up
					newX = lastLink.x;
					newY = lastLink.y-1;
					break;
				default:
					break;
			}
			if (
					this.lifeScene.checkIfInSceneFrame(newX, newY) &&
					this.existingLink(newX, newY, this)==null &&
					this.existingLink(newX, newY, otherSnake)==null &&
					this.lifeScene.getFoodExpert().checkFoodExistence(newX, newY)==null
			)
			{
				freePlace = new SnakeGameLifeScene.Place(newX, newY);
				listOfFreePlaces.add(freePlace);
			}
			
		} //End for of the four directions
		
		if (listOfFreePlaces.size()>0) { //If we found at least one place for snake extension,
			//We choose randomly one place, for the snake extension.
			randomNumber = randomExpert.nextInt(listOfFreePlaces.size());
			newLink = new SnakeLink();
			newLink.x = listOfFreePlaces.get(randomNumber).x;
			newLink.y = listOfFreePlaces.get(randomNumber).y;
		}
		else return false;
		
		//We gave it a random type.
		randomNumber = randomExpert.nextInt(2);
		
		if (randomNumber==0) {
			newLink.typeLink = LinkTypeEnum.FIRST_LINK;
		}
		else {
			newLink.typeLink = LinkTypeEnum.SECOND_LINK;
		}
		
		this.links.add(newLink);
		//The snake make a noise while growing.
		// This technical stuff was not placed in a simu_comp_worker, because so simple!
		java.awt.Toolkit.getDefaultToolkit().beep();
		
		return true; //We achieved the snake extension
	}
	
	/*
	 * We check if in (x,y), there is a link of a snake(us or another).
	 * Check if we are in the scene limits. Return the found SnakeLink,
	 * or else null.
	 */
	public SnakeLink existingLink(int x, int y, Snake snake) {
		if (!this.lifeScene.checkIfInSceneFrame(x, y)) return null;
		
		for (int i=0; i<snake.links.size();i++) { //We're ckecking even the head, but it is in goal of the food placing problem. 
			if (snake.links.get(i).x == x && snake.links.get(i).y == y){
				return snake.links.get(i);
			}
		}
		return null;
	}
	
	public void increaseSpeed() {
		if (this.speed > SPEED_STEP) { //Not >= because this could not be 0.
			this.lifeScene.getRealiz().doChangeSpeedGearEffect();
			this.speed -= SPEED_STEP;
		}
	}

	public void decreaseSpeed() {
		if (this.speed <= (NB_SPEED_GEARS-1) * SPEED_STEP) {
			this.lifeScene.getRealiz().doChangeSpeedGearEffect();
			this.speed += SPEED_STEP;
		}
	}

	@Long_action
	public void endLongActions() {
		//Here we have a particular case of endLongActions() because the sliding long action
		//never ends. In much cases, we're "waiting", and then we pass the associated boolean
		//to false, for example isFalling(), to stop the action!
	
		if (this.lifeScene.getRealiz().getWindow().timePassed(this.getSpeed())) {
			this.continueMakeSliding();
		}
	}
}
