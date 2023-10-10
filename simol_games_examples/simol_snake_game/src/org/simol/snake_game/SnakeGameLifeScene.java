package org.simol.snake_game;


// public simu_rewo SnakeGameLifeScene
public class SnakeGameLifeScene {
	// In public visibility, for Snake, etc., accesses to the window, if needed(display).
	
	// Accessors
	private SnakeGameLifeSceneRealiz realiz;
	//Only a getter.
	public SnakeGameLifeSceneRealiz getRealiz() {
		return realiz;
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

	Thread snakeOneWorker;
	Thread snakeTwoWorker;
	
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
		
		snakeOneWorker = new Thread(this.snake);
		snakeOneWorker.start(); //Let the snake live.
		
		snakeTwoWorker = new Thread(this.snake_two);
		snakeTwoWorker.start();
		
		//Begin the display. Can be considered as a view.
		this.realiz = new SnakeGameLifeSceneRealiz(this);
	}
	
	public boolean checkIfInSceneFrame(int x, int y) {
		return x>=0 && x<SnakeGameLifeScene.SCENE_COLUMNS_COUNT && y>=0 && y<SnakeGameLifeScene.SCENE_ROWS_COUNT;
	}
	
}
