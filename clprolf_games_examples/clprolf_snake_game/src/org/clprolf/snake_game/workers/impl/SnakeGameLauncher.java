package org.clprolf.snake_game.workers.impl;

import org.clprolf.framework.java.With_compat;
import org.clprolf.framework.java.Worker_agent;
import org.clprolf.snake_game.impl.SnakeGameSceneImpl;
import org.clprolf.snake_game.interfaces.SnakeGameScene;

/**
 * It's a simple 2D snake game, with two players and two snakes.
 * The display is with Swing, in a JFrame.
 * 
 * There are 4 speed gears.
 * Keys: Snake one: arrows, and comma/space for speed gear changes.
 * Snake two: z/w up/down, q/s left/right, a/x for speed gear changes.
 * 
 * possible evolves:
 * Count score, and display it, but the winner is the one who don't loose, except if all food is eaten.
 * 
 * Version: 20251003
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
