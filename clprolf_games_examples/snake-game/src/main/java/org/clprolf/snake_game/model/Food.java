package org.clprolf.snake_game.model;

import org.clprolf.framework.java.Model;

@Model
public class Food {
	public enum FoodType {
		APPLE, ORANGE
	}
	
	private FoodType type;
	public FoodType getType() {
		return type;
	}
	public void setType(FoodType type) {
		this.type = type;
	}
	
	private int x;
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
