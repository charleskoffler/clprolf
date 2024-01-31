package org.simol.snake_game;

//could be seen as a simu_real_world_obj of a real key event.
import java.awt.event.KeyEvent;
//could be seen as a simu_real_world_obj.
import java.awt.event.KeyListener;
// simu_real_world_obj of a physical machine tool, for example.
import javax.swing.JFrame;

import org.simol.simolframework.java.Contracts;
import org.simol.simolframework.java.Nature;
import org.simol.simolframework.java.Simu_real_world_obj;
import org.simol.snake_game.Snake.SlidingType;

// public simu_real_world_obj SnakeWindow nature JFrame contracts KeyListener {
@Simu_real_world_obj
public class SnakeWindow extends @Nature JFrame implements @Contracts Runnable, KeyListener {
	//We can see it as a simu_real_world_obj, the Thread.
	private Thread cyclesThread;
	private long paintCounter;
	
	// Accessors
	// A way to access to simu_real_world_obj big brother object.
	// Only a getter.
	private SnakeGameLifeSceneRealiz real;
	
	public SnakeGameLifeSceneRealiz getReal() {
		return real;
	}

	//public, for example, for Snake access.
	private SnakeGlobalPanel globalPanel;
		
	public SnakeGlobalPanel getGlobalPanel() {
		return globalPanel;
	}

	public void setGlobalPanel(SnakeGlobalPanel globalPanel) {
		this.globalPanel = globalPanel;
	}

	
	//
	
	private boolean blnContinue;
	
	public void setBlnContinue(boolean blnContinue) {
		this.blnContinue = blnContinue;
	}

	public SnakeWindow(SnakeGameLifeSceneRealiz real) {
		this.real = real;
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
		globalPanel = new SnakeGlobalPanel(this);
		
		this.setContentPane(globalPanel);
	}
	
	/* Just count cycles, and send repaint to refresh of the scene. All the rest is done in
	 * the paint method, to avoir useless synchronizing problems. */
	@Override
	public void run() {
		// An infinite loop, refreshing the displaying panel each 20 milliseconds.
		while (blnContinue) {
			this.paintCounter++;
			this.globalPanel.repaint();
			
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
	/* We're just calling the correct method of the simu_real_world_obj. */
	@Override
	public void keyPressed(KeyEvent e) {
		Snake concernedSnake = null;
		
		/* MOVES MANAGEMENT */
		switch(e.getKeyCode()) {
			case KeyEvent.VK_LEFT:
				concernedSnake = this.real.getLifeScene().getSnake();
				concernedSnake.setLastSlidingType(SlidingType.LEFT_SLIDING);
				break;
			case KeyEvent.VK_RIGHT:
				concernedSnake = this.real.getLifeScene().getSnake();
				concernedSnake.setLastSlidingType(SlidingType.RIGHT_SLIDING);
				break;
			case KeyEvent.VK_UP:
				concernedSnake = this.real.getLifeScene().getSnake();
				concernedSnake.setLastSlidingType(SlidingType.UP_SLIDING);
				break;
			case KeyEvent.VK_DOWN:
				concernedSnake = this.real.getLifeScene().getSnake();
				concernedSnake.setLastSlidingType(SlidingType.DOWN_SLIDING);
				break;
			case KeyEvent.VK_COMMA:
				concernedSnake = this.real.getLifeScene().getSnake();
				concernedSnake.increaseSpeed();
				break;
			case KeyEvent.VK_SPACE:
				concernedSnake = this.real.getLifeScene().getSnake();
				concernedSnake.decreaseSpeed();
				break;
			case KeyEvent.VK_Q:
				concernedSnake = this.real.getLifeScene().getSnake_two();
				concernedSnake.setLastSlidingType(SlidingType.LEFT_SLIDING);
				break;
			case KeyEvent.VK_S:
				concernedSnake = this.real.getLifeScene().getSnake_two();
				concernedSnake.setLastSlidingType(SlidingType.RIGHT_SLIDING);
				break;
			case KeyEvent.VK_Z:
				concernedSnake = this.real.getLifeScene().getSnake_two();
				concernedSnake.setLastSlidingType(SlidingType.UP_SLIDING);
				break;
			case KeyEvent.VK_W:
				concernedSnake = this.real.getLifeScene().getSnake_two();
				concernedSnake.setLastSlidingType(SlidingType.DOWN_SLIDING);
				break;
			case KeyEvent.VK_A:
				concernedSnake = this.real.getLifeScene().getSnake_two();
				concernedSnake.increaseSpeed();
				break;
			case KeyEvent.VK_X:
				concernedSnake = this.real.getLifeScene().getSnake_two();
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
