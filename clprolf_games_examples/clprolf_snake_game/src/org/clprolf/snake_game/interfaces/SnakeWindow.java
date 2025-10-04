package org.clprolf.snake_game.interfaces;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import org.clprolf.framework.java.Abstraction;
import org.clprolf.framework.java.Forced_int_inh;
import org.clprolf.framework.java.Nature;
import org.clprolf.framework.java.Version_inh;
import org.clprolf.framework.java.With_compat;

import org.clprolf.snake_game.workers.interfaces.SnakeGameSceneRealiz;

@Forced_int_inh //extends Java interfaces, and Runnable + KeyListener should be capacity interfaces with worker_agent_like advice!
@Abstraction
@Version_inh
public interface SnakeWindow extends @Nature Runnable, KeyListener{
	
		public SnakeGameSceneRealiz getReal();

		public SnakeGlobalPanel getGlobalPanel();

		public void setGlobalPanel(@With_compat SnakeGlobalPanel globalPanel);
		public void setBlnContinue(boolean blnContinue);
		
		public boolean timePassed(int paintCycles);

		@Override
		public void run();
		
		@Override
		public void keyPressed(KeyEvent e);

		@Override
		public void keyReleased(KeyEvent e);
		
		@Override
		public void keyTyped(KeyEvent e);
}
