package org.simol.snake_game;

//Could be seen as a simu_rewo, a queue of real-world event of a physical machine tool.
import java.awt.EventQueue;

// public simu_rewo SnakeGameLifeScene contracts Runnable
public class SnakeGameLifeScene implements Runnable {
	// In public visibility, for Snake, etc., accesses to the window, if needed(display).
	
	// Accessors
	private SnakeWindow window;
	public SnakeWindow getWindow() {
		return window;
	}

	public void setWindow(SnakeWindow window) {
		this.window = window;
	}

	private Snake snake;
	public Snake getSnake() {
		return snake;
	}

	public void setSnake(Snake snake) {
		this.snake = snake;
	}

	private Snake snake_two;
	public Snake getSnake_two() {
		return snake_two;
	}

	public void setSnake_two(Snake snake_two) {
		this.snake_two = snake_two;
	}

	private FoodExpert foodExpert;
	public FoodExpert getFoodExpert() {
		return foodExpert;
	}

	public void setFoodExpert(FoodExpert foodExpert) {
		this.foodExpert = foodExpert;
	}
	//

	Thread snailOneWorker;
	Thread snailTwoWorker;
	
	public static int SCENE_ROWS_COUNT = 20;
	public static int SCENE_COLUMNS_COUNT = 40;
	
	//A simple class representing a location a the life scene
	// public rewo Place
	public static class Place {
		int x;
		int y;
		public Place(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	public SnakeGameLifeScene()  {
		//Create simu_rewo objects before the window.
		this.snake = new Snake(this, 0, "blue");
		this.snake_two = new Snake(this, 19, "grey");
		
		//Positionning the food
		this.foodExpert = new FoodExpert(this);
		this.foodExpert.positionFood();
		//
		
		snailOneWorker = new Thread(this.snake);
		snailOneWorker.start();
		
		snailTwoWorker = new Thread(this.snake_two);
		snailTwoWorker.start();
		
		EventQueue.invokeLater(this);
	}
	
	// Just for the EventQueue.invokeLater().
	public void run() {
		// Creation of the window using the dispatch thread.
		window = new SnakeWindow(this);
	}

	public boolean checkIfInSceneFrame(int x, int y) {
		return x>=0 && x<SnakeGameLifeScene.SCENE_COLUMNS_COUNT && y>=0 && y<SnakeGameLifeScene.SCENE_ROWS_COUNT;
	}
	
}
