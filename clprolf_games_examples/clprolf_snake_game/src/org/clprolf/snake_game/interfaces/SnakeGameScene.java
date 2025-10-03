package org.clprolf.snake_game.interfaces;

import java.util.Random;

import org.clprolf.framework.java.Abstraction;
import org.clprolf.framework.java.Version_inh;
import org.clprolf.snake_game.impl.FoodExpertImpl;
import org.clprolf.snake_game.impl.SnakeImpl;
import org.clprolf.snake_game.workers.impl.SnakeGameSceneRealizImpl;

@Abstraction
@Version_inh
public interface SnakeGameScene {
	
	public SnakeGameSceneRealizImpl getRealiz();

	public SnakeImpl getSnake();

	public void setSnake(SnakeImpl snake);

	public SnakeImpl getSnake_two();

	public void setSnake_two(SnakeImpl snake_two);

	public FoodExpertImpl getFoodExpert();
	
	public Random getRandomExpert();

	public void setFoodExpert(FoodExpertImpl foodExpert);
	//
	public boolean checkIfInSceneFrame(int x, int y);
	
}
