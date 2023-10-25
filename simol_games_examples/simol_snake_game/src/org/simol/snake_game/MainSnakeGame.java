package org.simol.snake_game;

import org.simol.simolframework.java.Simu_comp_worker;

/**
 * Snake game initially written in simol. It's a simple 2D snake game, with two players and two snakes.
 * The display is with Swing, in a JFrame.
 * 
 * V3.1(20231010).
 * Added a realization simu_comp_worker class, showing typical using of realization class in simol.
 * It acts much like a view of MVC. This simplify our present case, which was not so simple.
 * 
 * possible evolves:
 * Count score, and display it, but the winner is the one who don't loose, except if all food is eaten.
 * 
 *
 * 
 * @author Charles Koffler for simol language GitHub Repository
 *
 */
//public simu_comp_worker MainSnakeGame
@Simu_comp_worker
public class MainSnakeGame {
	public static void main(String[] args) {
		//Just create a life scene, and the simulation will be displayed.
			SnakeGameLifeScene scene = new SnakeGameLifeScene();
	}
}
