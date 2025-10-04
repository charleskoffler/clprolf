package org.clprolf.snake_game.impl;

import java.awt.event.KeyEvent;
import javax.swing.JFrame;

import org.clprolf.framework.java.Contracts;
import org.clprolf.framework.java.Forced_inh;
import org.clprolf.framework.java.Nature;
import org.clprolf.framework.java.With_compat;
import org.clprolf.snake_game.impl.SnakeImpl.SlidingType;
import org.clprolf.snake_game.interfaces.Snake;
import org.clprolf.snake_game.interfaces.SnakeGamePanel;
import org.clprolf.snake_game.interfaces.SnakeWindow;
import org.clprolf.snake_game.workers.interfaces.SnakeGameSceneRenderer;
import org.clprolf.framework.java.Abstraction;

@Forced_inh // extends a Java class
@Abstraction
public class SnakeWindowImpl extends @Nature JFrame implements @Contracts SnakeWindow {
	//The thread abstraction
	private Thread cyclesThread;
	private long paintCounter;
	
	// Only a getter.
	private @With_compat SnakeGameSceneRenderer renderer;
	
	public SnakeGameSceneRenderer getRenderer() {
		return renderer;
	}

	private @With_compat SnakeGamePanel gamePanel;
		
	public SnakeGamePanel getGamePanel() {
		return gamePanel;
	}

	public void setGamePanel(@With_compat SnakeGamePanel globalPanel) {
		this.gamePanel = globalPanel;
	}

	
	//
	
	private boolean blnContinue;
	
	public void setBlnContinue(boolean blnContinue) {
		this.blnContinue = blnContinue;
	}

	public SnakeWindowImpl(@With_compat SnakeGameSceneRenderer real) {
		this.renderer = real;
		this.paintCounter = 0;
		
		this.createComponents();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 450, 300);
		this.setTitle("Fenêtre jeu");
		this.setResizable(false);
		
		this.addKeyListener(this);
		this.setVisible(true);
		//
		//Just a thread to count cycles and send repaint event, to regularly refresh the display
		//by the AWT-EventQueue Thread.
		//Created another thread, because the SnakeWindow uses the AWT-EventQueue Thread.
		this.blnContinue = true;
		cyclesThread = new Thread(this);
		cyclesThread.start();
	}
	
	private void createComponents() {
		gamePanel = new SnakeGamePanelImpl(this);
		
		this.setContentPane((SnakeGamePanelImpl)gamePanel);
	}
	
	/* Just count cycles, and send repaint to refresh of the scene. All the rest is done in
	 * the paint method, to avoir useless synchronizing problems. */
	@Override
	public void run() {
		// An infinite loop, refreshing the displaying panel each 20 milliseconds.
		while (blnContinue) {
			this.paintCounter++;
			((SnakeGamePanelImpl)(this.gamePanel)).repaint();
			
			try {
				Thread.sleep(20); /* 10ms = 100 times per secondes. */
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public boolean timePassed(int paintCycles) {
		return this.paintCounter%paintCycles == 0;
	}
	
	/* *************************** EVENT MANAGEMENT ******************* */
	/* We're just calling the correct method of the simu_real_obj. */
	@Override
	public void keyPressed(KeyEvent e) {
		@With_compat Snake concernedSnake = null;
		
		/* MOVES MANAGEMENT */
		switch(e.getKeyCode()) {
			case KeyEvent.VK_LEFT:
				concernedSnake = this.renderer.getScene().getSnake();
				concernedSnake.setLastSlidingType(SlidingType.LEFT_SLIDING);
				break;
			case KeyEvent.VK_RIGHT:
				concernedSnake = this.renderer.getScene().getSnake();
				concernedSnake.setLastSlidingType(SlidingType.RIGHT_SLIDING);
				break;
			case KeyEvent.VK_UP:
				concernedSnake = this.renderer.getScene().getSnake();
				concernedSnake.setLastSlidingType(SlidingType.UP_SLIDING);
				break;
			case KeyEvent.VK_DOWN:
				concernedSnake = this.renderer.getScene().getSnake();
				concernedSnake.setLastSlidingType(SlidingType.DOWN_SLIDING);
				break;
			case KeyEvent.VK_COMMA:
				concernedSnake = this.renderer.getScene().getSnake();
				concernedSnake.increaseSpeed();
				break;
			case KeyEvent.VK_SPACE:
				concernedSnake = this.renderer.getScene().getSnake();
				concernedSnake.decreaseSpeed();
				break;
			case KeyEvent.VK_Q:
				concernedSnake = this.renderer.getScene().getSnake_two();
				concernedSnake.setLastSlidingType(SlidingType.LEFT_SLIDING);
				break;
			case KeyEvent.VK_S:
				concernedSnake = this.renderer.getScene().getSnake_two();
				concernedSnake.setLastSlidingType(SlidingType.RIGHT_SLIDING);
				break;
			case KeyEvent.VK_Z:
				concernedSnake = this.renderer.getScene().getSnake_two();
				concernedSnake.setLastSlidingType(SlidingType.UP_SLIDING);
				break;
			case KeyEvent.VK_W:
				concernedSnake = this.renderer.getScene().getSnake_two();
				concernedSnake.setLastSlidingType(SlidingType.DOWN_SLIDING);
				break;
			case KeyEvent.VK_A:
				concernedSnake = this.renderer.getScene().getSnake_two();
				concernedSnake.increaseSpeed();
				break;
			case KeyEvent.VK_X:
				concernedSnake = this.renderer.getScene().getSnake_two();
				concernedSnake.decreaseSpeed();
				break;
				
			default:
				break;
		}
	
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	/* *************************** END OF EVENT MANAGEMENT ******************* */

}
