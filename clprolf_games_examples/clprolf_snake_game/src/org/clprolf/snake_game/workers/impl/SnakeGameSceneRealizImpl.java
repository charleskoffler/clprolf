package org.clprolf.snake_game.workers.impl;

import java.awt.EventQueue;

import org.clprolf.framework.java.Contracts;
import org.clprolf.framework.java.With_compat;
import org.clprolf.framework.java.Worker_agent;
import org.clprolf.snake_game.impl.SnakeGameSceneImpl;
import org.clprolf.snake_game.impl.SnakeImpl;
import org.clprolf.snake_game.impl.SnakeWindowImpl;
import org.clprolf.snake_game.interfaces.Snake;
import org.clprolf.snake_game.interfaces.SnakeGameScene;
import org.clprolf.snake_game.interfaces.SnakeWindow;
import org.clprolf.snake_game.workers.interfaces.SnakeGameSceneRealiz;


@Worker_agent
public class SnakeGameSceneRealizImpl implements @Contracts SnakeGameSceneRealiz {

	private @With_compat SnakeGameScene scene;

	public @With_compat SnakeGameScene getScene() {
		return scene;
	}
	
	private @With_compat SnakeWindow window;
	//Just a getter
	public @With_compat SnakeWindow getWindow() {
		return window;
	}

	//

	public SnakeGameSceneRealizImpl(@With_compat SnakeGameScene lifeScene) {
		this.scene = lifeScene;
		EventQueue.invokeLater(this);
	}
	
	// Just for the EventQueue.invokeLater().
	@Override
	public void run() {
			// Creation of the window using the dispatch thread.
			// The window will refresh itself his display, many times per seconds.
			window = new SnakeWindowImpl(this);
	}

	public void reactToGameOver(@With_compat Snake concernedSnake) {
		this.window.setBlnContinue(false);
		String msg = new String("The " + concernedSnake.getColor() + " snake is loosing!");
		java.awt.Toolkit.getDefaultToolkit().beep();
		this.getWindow().getGlobalPanel().getLblVictory().setText(msg);
	}
	
	public void doChangeSpeedGearEffect() {
		java.awt.Toolkit.getDefaultToolkit().beep();
	}
	
	public void doLinkAddingSound() {
		java.awt.Toolkit.getDefaultToolkit().beep();
	}
}
