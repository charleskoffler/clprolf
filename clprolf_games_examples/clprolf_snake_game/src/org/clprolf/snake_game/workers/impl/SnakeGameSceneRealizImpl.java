package org.clprolf.snake_game.workers.impl;

import java.awt.EventQueue;

import org.clprolf.framework.java.Contracts;
import org.clprolf.framework.java.Worker_agent;
import org.clprolf.snake_game.impl.SnakeGameSceneImpl;
import org.clprolf.snake_game.impl.SnakeImpl;
import org.clprolf.snake_game.impl.SnakeWindowImpl;
import org.clprolf.snake_game.workers.interfaces.SnakeGameSceneRealiz;


@Worker_agent
public class SnakeGameSceneRealizImpl implements @Contracts SnakeGameSceneRealiz {

	private SnakeGameSceneImpl scene;

	public SnakeGameSceneImpl getScene() {
		return scene;
	}
	
	private SnakeWindowImpl window;
	//Just a getter
	public SnakeWindowImpl getWindow() {
		return window;
	}

	//

	public SnakeGameSceneRealizImpl(SnakeGameSceneImpl lifeScene) {
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

	public void reactToGameOver(SnakeImpl concernedSnake) {
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
