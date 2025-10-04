package org.clprolf.snake_game.workers.interfaces;

import org.clprolf.framework.java.Forced_int_inh;
import org.clprolf.framework.java.Nature;
import org.clprolf.framework.java.Version_inh;
import org.clprolf.framework.java.With_compat;
import org.clprolf.framework.java.Worker_agent;
import org.clprolf.snake_game.interfaces.Snake;
import org.clprolf.snake_game.interfaces.SnakeGameScene;
import org.clprolf.snake_game.interfaces.SnakeWindow;

@Forced_int_inh // implements a Java interface
@Worker_agent
@Version_inh
public interface SnakeGameSceneRenderer extends @Nature Runnable {
	public @With_compat SnakeGameScene getScene();
	
	public SnakeWindow getWindow();

	public void run();

	public void reactToGameOver(@With_compat Snake concernedSnake);
	
	public void doChangeSpeedGearEffect();
	
	public void doLinkAddingSound();
}
