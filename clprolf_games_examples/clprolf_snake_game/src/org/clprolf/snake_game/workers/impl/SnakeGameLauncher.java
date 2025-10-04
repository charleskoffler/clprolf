package org.clprolf.snake_game.workers.impl;

import org.clprolf.framework.java.With_compat;
import org.clprolf.framework.java.Worker_agent;
import org.clprolf.snake_game.impl.SnakeGameSceneImpl;
import org.clprolf.snake_game.interfaces.SnakeGameScene;

/**
 * A simple 2D Snake game with two players and two snakes.
 * The rendering is done with Swing, inside a JFrame.
 *
 * There are four speed gears.
 *
 * Controls:
 *  - Snake 1: Arrow keys to move, and comma/space to change speed.
 *  - Snake 2: Z/W for up/down, Q/S for left/right, and A/X to change speed.
 *
 * Possible improvements:
 *  - Add a scoring system and display it on the screen.
 *  - The winner is the one who doesn’t lose — unless all the food is eaten.
 *
 * Version: 20251004
 * 
 * @author Charles Koffler
 *
 */

@Worker_agent
public class SnakeGameLauncher {
	public static void main(String[] args) {
		//Just create a scene, and the game will start.
		@With_compat SnakeGameScene scene = new SnakeGameSceneImpl();
	}
}
