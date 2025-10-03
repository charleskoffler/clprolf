package org.clprolf.snake_game.impl;

import java.util.Random;

import org.clprolf.framework.java.Abstraction;
import org.clprolf.framework.java.Contracts;
import org.clprolf.framework.java.Model;
import org.clprolf.snake_game.interfaces.SnakeGameScene;
import org.clprolf.snake_game.workers.impl.SnakeGameSceneRealizImpl;


@Abstraction
public class SnakeGameSceneImpl implements @Contracts SnakeGameScene {
	
	private SnakeGameSceneRealizImpl realiz;
	//Only a getter.
	public SnakeGameSceneRealizImpl getRealiz() {
		return realiz;
	}

	private SnakeImpl snake;
	public SnakeImpl getSnake() {
		return snake;
	}

	public void setSnake(SnakeImpl snake) {
		this.snake = snake;
	}

	private SnakeImpl snake_two;
	public SnakeImpl getSnake_two() {
		return snake_two;
	}

	public void setSnake_two(SnakeImpl snake_two) {
		this.snake_two = snake_two;
	}

	private FoodExpertImpl foodExpert;
	public FoodExpertImpl getFoodExpert() {
		return foodExpert;
	}
	private Random randomExpert;

	public Random getRandomExpert() {
		return randomExpert;
	}

	public void setFoodExpert(FoodExpertImpl foodExpert) {
		this.foodExpert = foodExpert;
	}
	//

	public static int SCENE_ROWS_COUNT = 20;
	public static int SCENE_COLUMNS_COUNT = 40;
	
	//A simple class representing a location in the scene
	// public real_world_obj Place
	@Model
	public static class Place {
		int x;
		int y;
		public Place(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	public SnakeGameSceneImpl()  {
		//Create agent objects before the window.
		this.snake = new SnakeImpl(this, 0, "blue");
		this.snake_two = new SnakeImpl(this, 19, "grey");
		
		//Positionning the food
		this.foodExpert = new FoodExpertImpl(this);
		this.foodExpert.positionFood();
		//
		randomExpert = new Random();
		
		//Begin the display. Can be considered as a view.
		this.realiz = new SnakeGameSceneRealizImpl(this);
	}
	
	public boolean checkIfInSceneFrame(int x, int y) {
		return x>=0 && x<SnakeGameSceneImpl.SCENE_COLUMNS_COUNT && y>=0 && y<SnakeGameSceneImpl.SCENE_ROWS_COUNT;
	}
	
}
