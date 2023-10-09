package org.simol.snake_game;

/**
 * Snake game initially written in simol. It's a simple 2D snake game, with two players and two snakes.
 * The display is with Swing, in a JFrame.
 * 
 * V3.0(20231009).
 *
 * English translation. Refactoring and added simol comments.
 * 
 * possible evolves:
 * Count score, and display it, but the winner is the one who don't loose, except if all food is eaten.
 * 
 *
 * 
 * @author Charles Koffler for simol language GitHub Repository
 *
 */
//public simu_alfoc MainSnakeGame
public class MainSnakeGame {
	public static void main(String[] args) {
		//Just create a life scene, and the simulation will be displayed.
			SnakeGameLifeScene scene = new SnakeGameLifeScene();
	}
}
