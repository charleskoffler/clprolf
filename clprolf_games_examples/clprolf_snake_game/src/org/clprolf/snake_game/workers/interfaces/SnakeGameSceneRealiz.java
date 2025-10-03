package org.clprolf.snake_game.workers.interfaces;

import java.awt.EventQueue;

import org.clprolf.framework.java.Forced_int_inh;
import org.clprolf.framework.java.Nature;
import org.clprolf.framework.java.Version_inh;
import org.clprolf.framework.java.Worker_agent;
import org.clprolf.snake_game.impl.SnakeGameSceneImpl;
import org.clprolf.snake_game.impl.SnakeImpl;
import org.clprolf.snake_game.impl.SnakeWindowImpl;

@Forced_int_inh // implements a Java interface
@Worker_agent
@Version_inh
public interface SnakeGameSceneRealiz extends @Nature Runnable {
	public SnakeGameSceneImpl getScene();
	
	public SnakeWindowImpl getWindow();

	public void run();

	public void reactToGameOver(SnakeImpl concernedSnake);
	
	public void doChangeSpeedGearEffect();
	
	public void doLinkAddingSound();
}
