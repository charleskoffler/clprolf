package org.clprolf.snake_game.interfaces;

import java.util.ArrayList;

import org.clprolf.framework.java.Agent;
import org.clprolf.framework.java.Version_inh;
import org.clprolf.snake_game.impl.SnakeGameSceneImpl;
import org.clprolf.snake_game.model.Food;


@Agent
@Version_inh
public interface FoodExpert {
	public SnakeGameSceneImpl getScene();

	public void setScene(SnakeGameSceneImpl scene);

	public ArrayList<Food> getFoodList();
	
	public void setFoodList(ArrayList<Food> foodList);
	
	public void positionFood();
	
	public Food getFoodAt(int x, int y);
}
