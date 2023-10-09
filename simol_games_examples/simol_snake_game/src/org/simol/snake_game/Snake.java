package org.simol.snake_game;

/* could be seen as a simu_rewo of a mathematical set object. */
import java.util.ArrayList;
/* could be seen as a simu_rewo of an expert. */
import java.util.Random;

//public simu_rewo Snake contracts Runnable
public class Snake implements Runnable {
	public static int LINKS_NUMBER = 20;
	public static int SPEED = 100;
	
	protected SnakeGameLifeScene lifeScene;
	
	public enum LinkTypeEnum {
		HEAD_LINK,
		FIRST_LINK,
		SECOND_LINK
	}
	public enum SlidingType {
		UP_SLIDING,
		DOWN_SLIDING,
		LEFT_SLIDING,
		RIGHT_SLIDING
	}
	public enum DirectionEnum{
		HALT_DIRECTION, /* For the beginning of the game. */
		UP_DIRECTION,
		DOWN_DIRECTION,
		LEFT_DIRECTION,
		RIGHT_DIRECTION
	}
	// public rewo SnakeLink
	public class SnakeLink {
		public int x;
		public int y;
		public LinkTypeEnum typeMaillon;
	}
	// Accessors
	private ArrayList<SnakeLink> links;
	public ArrayList<SnakeLink> getLinks() {
		return links;
	}

	public void setLinks(ArrayList<SnakeLink> links) {
		this.links = links;
	}

	private DirectionEnum currentDirection;
	
	public DirectionEnum getCurrentDirection() {
		return currentDirection;
	}

	public void setCurrentDirection(DirectionEnum currentDirection) {
		this.currentDirection = currentDirection;
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
		links = new ArrayList<SnakeLink>();
		constructSnakeLinks(startY);
		this.currentDirection = DirectionEnum.HALT_DIRECTION;
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
					link.typeMaillon = LinkTypeEnum.FIRST_LINK;
				}
				else {
					link.typeMaillon = LinkTypeEnum.SECOND_LINK;
				}
			}
			else {
				link.typeMaillon = LinkTypeEnum.HEAD_LINK;
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
	 * Make slide the snake if we can(no wall, or no meet of our self body). Return true, except if
	 * there's a collision with another snake.
	 * @param slidingType
	 * @return true if the sliding was made, or if we bit ourselves. False if we bit another snake.
	 */
	//we used a 'underst', because it seems hard coding this.
	//public boolean underst makeSliding
	public boolean makeSliding(SlidingType slidingType) {
		SnakeLink headLink = this.links.get(0);
		SnakeLink ancHeadLink, presentLink;
		Snake otherSnake=null;
		//When we bit ourselves, we can not bit our first link, because it is detected before.
		boolean blnBitesOther=false, blnBiteOurselv=false, blnWall=false;
		Food existingFood = null;
		
		//Snake distinction
		otherSnake = this.findOtherSnake();
		
		//Sauvegarde valeurs maillon tete
		ancHeadLink = new SnakeLink();
		ancHeadLink.x = headLink.x;
		ancHeadLink.y = headLink.y;
		
		//Head moving
		switch (slidingType) {
			case UP_SLIDING:
				blnBitesOther = existingLink(headLink.x, headLink.y-1, otherSnake) != null;
				presentLink = existingLink(headLink.x, headLink.y-1, this);
				blnBiteOurselv = (presentLink != null);
				
				existingFood = this.lifeScene.getFoodExpert().checkFoodExistence(headLink.x, headLink.y-1);
				blnWall = headLink.y<=0;
				if (!blnWall && !blnBiteOurselv && !blnBitesOther) {
					headLink.y--;
				}
				break;
			case DOWN_SLIDING:
				blnBitesOther = existingLink(headLink.x, headLink.y+1, otherSnake) != null;
				presentLink = existingLink(headLink.x, headLink.y+1, this);
				blnBiteOurselv = (presentLink != null);
				
				existingFood = this.lifeScene.getFoodExpert().checkFoodExistence(headLink.x, headLink.y+1);
				blnWall = headLink.y>=SnakeGameLifeScene.SCENE_ROWS_COUNT-1;
				if (!blnWall && !blnBiteOurselv && !blnBitesOther) {
					headLink.y++;
				}
				break;
			case LEFT_SLIDING:
				blnBitesOther = existingLink(headLink.x-1, headLink.y, otherSnake) != null;
				presentLink = existingLink(headLink.x-1, headLink.y, this);
				blnBiteOurselv = (presentLink != null);
				
				existingFood = this.lifeScene.getFoodExpert().checkFoodExistence(headLink.x-1, headLink.y);
				blnWall = headLink.x<=0;
				if (!blnWall && !blnBiteOurselv && !blnBitesOther) {
					headLink.x--;
				}
				break;
			case RIGHT_SLIDING:
				blnBitesOther = existingLink(headLink.x+1, headLink.y, otherSnake) != null;
				presentLink = existingLink(headLink.x+1, headLink.y, this);
				blnBiteOurselv = (presentLink != null);
				
				existingFood = this.lifeScene.getFoodExpert().checkFoodExistence(headLink.x+1, headLink.y);
				blnWall = headLink.x>=SnakeGameLifeScene.SCENE_COLUMNS_COUNT-1;
				if (!blnWall && !blnBiteOurselv && !blnBitesOther) {
					headLink.x++;
				}
				break;
		}
		if (blnBitesOther || blnBiteOurselv || blnWall) { // On ne fait rien, et on retourne false.
			return false;
		}
	
		//We can slide.
		
		//Rest of body moving, when sliding
		for (int i=this.links.size()-1; i>1; i--) {
			SnakeLink currentLink, previousLink;
			currentLink = this.links.get(i);
			previousLink = this.links.get(i-1);
			
			currentLink.y = previousLink.y;
			currentLink.x = previousLink.x;
		}
		//Moving of the second link
		// To put after the loop of the others links
		this.links.get(1).y = ancHeadLink.y;
		this.links.get(1).x = ancHeadLink.x;
		//
		// potentiel extension of the tail. Do here, with the same worker thread, for no synchronizing problems.
		// We moved, we ate food while moving, so we grew.
		if (existingFood!=null) {
			this.makeGrowSnake();
			this.lifeScene.getFoodExpert().getFoodList().remove(existingFood);
		}
		
		return true;
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
			newLink.typeMaillon = LinkTypeEnum.FIRST_LINK;
		}
		else {
			newLink.typeMaillon = LinkTypeEnum.SECOND_LINK;
		}
		
		this.links.add(newLink);
		//The snake make a noise while growing.
		// This technical stuff was not placed in a simu_alfoc, because so simple!
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
	
	public void changeDirection(DirectionEnum direction) {
		SnakeLink presentLink, headLink;
		boolean blnBiteFirstLink = false;
		
		headLink = this.links.get(0);
		
		switch (direction) {
		case UP_DIRECTION:
			presentLink = existingLink(headLink.x, headLink.y-1, this);
			if (presentLink != null) {
				if (presentLink != this.links.get(1)) {
					blnBiteFirstLink = false;
				}
				else {
					blnBiteFirstLink = true;
				}
			}
			
			break;
		case DOWN_DIRECTION:
			presentLink = existingLink(headLink.x, headLink.y+1, this);
			if (presentLink != null) {
				if (presentLink != this.links.get(1)) {
					blnBiteFirstLink = false;
				}
				else {
					blnBiteFirstLink = true;
				}
			}
			
			break;
		case LEFT_DIRECTION:
			presentLink = existingLink(headLink.x-1, headLink.y, this);
			if (presentLink != null) {
				if (presentLink != this.links.get(1)) {
					blnBiteFirstLink = false;
				}
				else {
					blnBiteFirstLink = true;
				}
			}
			
			break;
		case RIGHT_DIRECTION:
			presentLink = existingLink(headLink.x+1, headLink.y, this);
			if (presentLink != null) {
				if (presentLink != this.links.get(1)) {
					blnBiteFirstLink = false;
				}
				else {
					blnBiteFirstLink = true;
				}
			}
			
			break;
		default:
			break;
		}//End of switch.
		if (!blnBiteFirstLink) {
			this.currentDirection = direction;
		}
	}

	/* The run method here is not for displaying. */
	@Override
	public void run() {
		boolean reponse=true;
		
		while (!this.blnHalt) {
			switch(this.currentDirection) {
			case UP_DIRECTION:
				reponse = this.makeSliding(SlidingType.UP_SLIDING);
				break;
			case DOWN_DIRECTION:
				reponse = this.makeSliding(SlidingType.DOWN_SLIDING);
				break;
			case LEFT_DIRECTION:
				reponse = this.makeSliding(SlidingType.LEFT_SLIDING);
				break;
			case RIGHT_DIRECTION:
				reponse = this.makeSliding(SlidingType.RIGHT_SLIDING);
			default:
				break;
			}
			if (!reponse) {
				String msg = new String("The "+this.color+" snake is loosing!");
				java.awt.Toolkit.getDefaultToolkit().beep();
				this.lifeScene.getWindow().getGlobalPanel().lblVictory.setText(msg);
				this.lifeScene.getSnake().blnHalt = true;
				this.lifeScene.getSnake_two().blnHalt = true;
			}
			try {
				Thread.sleep(Snake.SPEED);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
