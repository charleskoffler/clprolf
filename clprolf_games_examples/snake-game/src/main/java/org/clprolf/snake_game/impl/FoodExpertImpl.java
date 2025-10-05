package org.clprolf.snake_game.impl;


import java.util.ArrayList;
import java.util.Random;

import org.clprolf.framework.java.Agent;
import org.clprolf.framework.java.Contracts;
import org.clprolf.framework.java.Gender;
import org.clprolf.framework.java.With_compat;
import org.clprolf.snake_game.model.Food;
import org.clprolf.snake_game.model.Food.FoodType;
import org.clprolf.snake_game.interfaces.FoodExpert;
import org.clprolf.snake_game.interfaces.SnakeGameScene;

@Agent(Gender.EXPERT_COMPONENT)
public class FoodExpertImpl implements @Contracts FoodExpert {
	public static int FOOD_COUNT = 40;

	private @With_compat SnakeGameScene scene;
	
	public SnakeGameScene getScene() {
		return scene;
	}

	public void setScene(@With_compat SnakeGameScene scene) {
		this.scene = scene;
	}

	private ArrayList<Food> foodList;
	
	public ArrayList<Food> getFoodList() {
		return foodList;
	}

	public void setFoodList(ArrayList<Food> foodList) {
		this.foodList = foodList;
	}

	//
	
	public FoodExpertImpl(@With_compat SnakeGameScene scene) {
		this.scene = scene;
		this.foodList = new ArrayList<Food>();
	}
	
	public void positionFood() {
		Random randomExpert = new Random();
		
		for (int i=0; i<FoodExpertImpl.FOOD_COUNT;i++) {
			boolean isInSnakeOne, isInSnakeTwo, isInFood;
			Food food;
			int randomType, x, y;
			
			do {
				
				x = randomExpert.nextInt(SnakeGameSceneImpl.SCENE_COLUMNS_COUNT);
				y = randomExpert.nextInt(SnakeGameSceneImpl.SCENE_ROWS_COUNT);
				
				isInFood = getFoodAt(x,y)!=null;
				isInSnakeOne = this.scene.getSnake().getLinkAt(x, y, this.scene.getSnake()) != null;
				isInSnakeTwo = this.scene.getSnake().getLinkAt(x, y, this.scene.getSnake_two()) != null;
			} while (isInFood || isInSnakeOne || isInSnakeTwo);
			food = new Food();
			// We choose randomly his type
			randomType = randomExpert.nextInt(2);
			switch(randomType) {
			case 0:
				food.setType(FoodType.ORANGE);
				break;
			case 1:
				food.setType(FoodType.APPLE);
				break;
			}
			//
			food.setX(x);
			food.setY(y);
			//
			
			this.foodList.add(food);
		}
	}
	
	public Food getFoodAt(int x, int y) {
		if (!this.scene.checkIfInSceneFrame(x,y)) return null;
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
