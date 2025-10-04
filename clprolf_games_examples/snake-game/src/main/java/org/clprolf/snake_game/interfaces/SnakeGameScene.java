package org.clprolf.snake_game.interfaces;

import java.util.Random;

import org.clprolf.framework.java.Abstraction;
import org.clprolf.framework.java.Version_inh;
import org.clprolf.framework.java.With_compat;
import org.clprolf.snake_game.workers.interfaces.SnakeGameSceneRenderer;

@Abstraction
@Version_inh
public interface SnakeGameScene {
	
	public SnakeGameSceneRenderer getRenderer();

	public Snake getSnake();

	public void setSnake(@With_compat Snake snake);

	public Snake getSnake_two();

	public void setSnake_two(@With_compat Snake snake_two);

	public FoodExpert getFoodExpert();
	
	public Random getRandomExpert();

	public void setFoodExpert(@With_compat FoodExpert foodExpert);
	//
	public boolean checkIfInSceneFrame(int x, int y);
	
}
