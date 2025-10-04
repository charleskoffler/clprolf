package org.clprolf.snake_game.impl;

import java.util.ArrayList;
import java.util.Random;

import org.clprolf.framework.java.Long_action;
import org.clprolf.framework.java.Prevent_missing_collision;
import org.clprolf.framework.java.Agent;
import org.clprolf.framework.java.Contracts;
import org.clprolf.framework.java.Model;
import org.clprolf.framework.java.Underst;
import org.clprolf.framework.java.With_compat;
import org.clprolf.snake_game.interfaces.Snake;
import org.clprolf.snake_game.interfaces.SnakeGameScene;
import org.clprolf.snake_game.model.Food;


@Agent
public class SnakeImpl implements @Contracts Snake {
	public static int LINKS_NUMBER = 20;
	public static int SPEED_STEP = 4; /* Three speed-gears with step of 4. */
	public static int NB_SPEED_GEARS = 4;

	protected int speed;
	
	public int getSpeed() {
		return speed;
	}

	protected @With_compat SnakeGameScene scene;
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
	
	@Model
	public static class SnakeLink {
		public int x;
		public int y;
		public LinkTypeEnum typeLink;
	}

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
	
	//
	
	public SnakeImpl(@With_compat SnakeGameScene scene, int startY, String color) {
		this.scene = scene;
		
		this.speed = 10;
		links = new ArrayList<SnakeLink>();
		constructSnakeLinks(startY);
		this.lastSlidingType = SlidingType.STOPPED;
		this.color = color;
	}
	
	private void constructSnakeLinks(int startY) {
		Random rand = new Random();
		
		for (int i=0; i<SnakeImpl.LINKS_NUMBER; i++) {
			int randomForLink;
			SnakeLink link = new SnakeLink();
			
			link.x = SnakeImpl.LINKS_NUMBER-i-1;
			link.y = startY;
			
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
		@With_compat Snake otherSnake=null;
		
		if (this==this.scene.getSnake()) {
			otherSnake = this.scene.getSnake_two();
		}
		else if (this==this.scene.getSnake_two()){
			otherSnake = this.scene.getSnake();
		}
		return otherSnake;
	}
	
	/**
	 * Never called in our case!!!
	 */
	@Long_action
	public void makeSliding() {
		//We do not need makeSliding() in this game, because the snake is always sliding!
		//
	}
	
	/**
	 * Make slide the snake if we can(no wall, or no meet of our self body).
	 * @param slidingType
	 * @return
	 */
	@Underst
	@Long_action
	protected void continueMakeSliding() {
		if (this.lastSlidingType == SlidingType.STOPPED) return; //We're doing nothing in that case!
		SnakeLink newHeadLink, presentHead = this.links.get(0);
		
		Food foodAtNewHeadPlace = null;
		
		newHeadLink = computeHeadLink(presentHead);
		
		doControlsForNewHead(newHeadLink);
		
		// potential extension of the tail.
		foodAtNewHeadPlace = this.scene.getFoodExpert().getFoodAt(newHeadLink.x, newHeadLink.y);
		
		if (foodAtNewHeadPlace!=null) {
			this.handleExistingFood(foodAtNewHeadPlace);
			this.updateBodyForSliding(true, newHeadLink);
		}
		else {
			this.updateBodyForSliding(false, newHeadLink);
		}
	}
	
	@Prevent_missing_collision
	protected void doControlsForNewHead(SnakeLink newHeadLink) {
		boolean blnBitesOther=false, blnBiteOurselv=false, blnWall=false;
		@With_compat Snake otherSnake=null;
		SnakeLink previousLinkAtNewHead;
		
		previousLinkAtNewHead = getLinkAt(newHeadLink.x, newHeadLink.y, this);
		
		otherSnake = this.findOtherSnake();
				
		blnBitesOther = getLinkAt(newHeadLink.x, newHeadLink.y, otherSnake) != null;
		blnBiteOurselv = (previousLinkAtNewHead != null);
		
		blnWall = newHeadLink.y<0 || newHeadLink.y>SnakeGameSceneImpl.SCENE_ROWS_COUNT-1
		|| newHeadLink.x<0 || newHeadLink.x>SnakeGameSceneImpl.SCENE_COLUMNS_COUNT-1;
		if (blnWall || blnBiteOurselv || blnBitesOther) {
			this.scene.getRealiz().reactToGameOver(this);
		}
	}
	
	SnakeLink computeHeadLink(SnakeLink presentHead) {
		SnakeLink newHeadLink = new SnakeLink();
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
				break;
			case STOPPED:	
				break;
			default:
				break;
		}
		return newHeadLink;
	}
	
	protected void handleExistingFood(Food existingFood) {
		this.scene.getFoodExpert().getFoodList().remove(existingFood);
	}
	
	protected void updateBodyForSliding(boolean isGrowing, SnakeLink newHeadLink) {
			
		//Rest of the body
		SnakeLink lastLink = null;
		int xGrowing = 0;
		int yGrowing = 0;
		
		if (isGrowing) {
			lastLink = this.getLinks().get(this.links.size()-1);
			xGrowing = lastLink.x;
			yGrowing = lastLink.y;
		}
		
		for (int i=this.links.size()-1; i>=1; i--) {
			SnakeLink currentLink, previousLink;
			currentLink = this.links.get(i);
			previousLink = this.links.get(i-1);
			
			currentLink.y = previousLink.y;
			currentLink.x = previousLink.x;
		}
		//The head
		//The head is updated now
		SnakeLink headLink = this.getLinks().get(0);
		headLink.x = newHeadLink.x;
		headLink.y = newHeadLink.y;
		newHeadLink = null;
					
		//
		if (isGrowing) {
			makeGrowing(xGrowing, yGrowing);
		}
	}
	
	
	protected void makeGrowing(int xGrowing, int yGrowing) {
		int randomNumber;
		
		SnakeLink growingLink = new SnakeLink();
		growingLink.x = xGrowing;
		growingLink.y = yGrowing;
		randomNumber = this.scene.getRandomExpert().nextInt(2);
		
		if (randomNumber==0) {
			growingLink.typeLink = LinkTypeEnum.FIRST_LINK;
		}
		else
		{
			growingLink.typeLink = LinkTypeEnum.SECOND_LINK;
		}
		this.scene.getRealiz().doLinkAddingSound();
		this.links.add(growingLink);
	}
	
	public SnakeLink getLinkAt(int x, int y, @With_compat Snake snake) {
		if (!this.scene.checkIfInSceneFrame(x, y)) return null;
		
		for (int i=0; i<snake.getLinks().size();i++) { //We're ckecking even the head, but it is in goal of the food placing problem. 
			if (snake.getLinks().get(i).x == x && snake.getLinks().get(i).y == y){
				return snake.getLinks().get(i);
			}
		}
		return null;
	}
	
	public void increaseSpeed() {
		if (this.speed > SPEED_STEP) { //Not >= because this could not be 0.
			this.scene.getRealiz().doChangeSpeedGearEffect();
			this.speed -= SPEED_STEP;
		}
	}

	public void decreaseSpeed() {
		if (this.speed <= (NB_SPEED_GEARS-1) * SPEED_STEP) {
			this.scene.getRealiz().doChangeSpeedGearEffect();
			this.speed += SPEED_STEP;
		}
	}

	@Long_action
	public void endLongActions() {
		//Here we have a particular case of endLongActions() because the sliding long action
		//never ends. In much cases, we're "waiting", and then we pass the associated boolean
		//to false, for example isFalling(), to stop the action!
	
		if (this.scene.getRealiz().getWindow().timePassed(this.getSpeed())) {
			this.continueMakeSliding();
		}
	}
}
