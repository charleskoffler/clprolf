package org.simol.snake_game;

// simu_rewo of a mathemetical set
import java.util.ArrayList;
// simu_rewo of a random expert
import java.util.Random;

import org.simol.snake_game.Food.FoodType;

//public simu_rewo FoodExpert
public class FoodExpert {
	public static int FOOD_COUNT = 40;
	
	//Accessors
	private SnakeGameLifeScene lifeScene;
	
	public SnakeGameLifeScene getLifeScene() {
		return lifeScene;
	}

	public void setLifeScene(SnakeGameLifeScene lifeScene) {
		this.lifeScene = lifeScene;
	}

	private ArrayList<Food> foodList;
	
	public ArrayList<Food> getFoodList() {
		return foodList;
	}

	public void setFoodList(ArrayList<Food> foodList) {
		this.foodList = foodList;
	}

	//
	
	public FoodExpert(SnakeGameLifeScene scene) {
		this.lifeScene = scene;
		this.foodList = new ArrayList<Food>();
	}
	
	public void positionFood() {
		Random randomExpert = new Random();
		
		for (int i=0; i<FoodExpert.FOOD_COUNT;i++) {
			boolean isInSnakeOne, isInSnakeTwo, isInFood;
			Food food;
			int randomType, x, y;
			
			do {
				
				x = randomExpert.nextInt(SnakeGameLifeScene.SCENE_COLUMNS_COUNT);
				y = randomExpert.nextInt(SnakeGameLifeScene.SCENE_ROWS_COUNT);
				
				isInFood = checkFoodExistence(x,y)!=null;
				isInSnakeOne = this.lifeScene.getSnake().existingLink(x, y, this.lifeScene.getSnake()) != null;
				isInSnakeTwo = this.lifeScene.getSnake().existingLink(x, y, this.lifeScene.getSnake_two()) != null;
			} while (isInFood || isInSnakeOne || isInSnakeTwo);
			food = new Food();
			// We choose randomly his type
			randomType = randomExpert.nextInt(2);
			switch(randomType) {
			case 0:
				food.setType(FoodType.ORANGE_FRUIT);
				break;
			case 1:
				food.setType(FoodType.APPLE_FRUIT);
				break;
			}
			//
			food.setX(x);
			food.setY(y);
			//
			
			this.foodList.add(food);
		}
	}
	
	/**
	 * Return the food, of existing, or else null.
	 * Check that we aren't outside the frame.
	 * @param x
	 * @param y
	 * @return
	 */
	public Food checkFoodExistence(int x, int y) {
		if (!this.lifeScene.checkIfInSceneFrame(x,y)) return null;
		for (int i=0;i<this.foodList.size();i++) { //No foreach, for no ConcurrentModificationException.
			Food food;
			food = this.foodList.get(i);
			if (food.getX() == x && food.getY() == y) {
				return food;
			}
		}
		return null;
	}
}
