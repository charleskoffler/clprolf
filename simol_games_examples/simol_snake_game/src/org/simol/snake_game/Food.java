package org.simol.snake_game;

// public real_world_obj Food
public class Food {
	public enum FoodType {
		APPLE_FRUIT, ORANGE_FRUIT
	}
	
	// Accessors
	private FoodType type;
	public FoodType getType() {
		return type;
	}
	public void setType(FoodType type) {
		this.type = type;
	}
	
	private int x; //Position of the food, in the life scene.
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	private int y;
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	//
}
