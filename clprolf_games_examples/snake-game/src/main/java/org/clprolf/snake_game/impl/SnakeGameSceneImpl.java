package org.clprolf.snake_game.impl;

import java.util.Random;

import org.clprolf.framework.java.Abstraction;
import org.clprolf.framework.java.Contracts;
import org.clprolf.framework.java.Model;
import org.clprolf.framework.java.Simu_real_obj;
import org.clprolf.framework.java.With_compat;
import org.clprolf.snake_game.interfaces.FoodExpert;
import org.clprolf.snake_game.interfaces.Snake;
import org.clprolf.snake_game.interfaces.SnakeGameScene;
import org.clprolf.snake_game.workers.impl.SnakeGameSceneRendererImpl;
import org.clprolf.snake_game.workers.interfaces.SnakeGameSceneRenderer;


@Simu_real_obj //Not a pure abstraction, because it has a worker.
public class SnakeGameSceneImpl implements @Contracts SnakeGameScene {
	
	private @With_compat SnakeGameSceneRenderer renderer;
	//Only a getter.
	public SnakeGameSceneRenderer getRenderer() {
		return renderer;
	}

	private @With_compat Snake snake;
	public Snake getSnake() {
		return snake;
	}

	public void setSnake(@With_compat Snake snake) {
		this.snake = snake;
	}

	private @With_compat Snake snake_two;
	public @With_compat Snake getSnake_two() {
		return snake_two;
	}

	public void setSnake_two(@With_compat Snake snake_two) {
		this.snake_two = snake_two;
	}

	private @With_compat FoodExpert foodExpert;
	public FoodExpert getFoodExpert() {
		return foodExpert;
	}
	private Random randomExpert;

	public Random getRandomExpert() {
		return randomExpert;
	}

	public void setFoodExpert(@With_compat FoodExpert foodExpert) {
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
		this.renderer = new SnakeGameSceneRendererImpl(this);
	}
	
	public boolean checkIfInSceneFrame(int x, int y) {
		return x>=0 && x<SnakeGameSceneImpl.SCENE_COLUMNS_COUNT && y>=0 && y<SnakeGameSceneImpl.SCENE_ROWS_COUNT;
	}
	
}
