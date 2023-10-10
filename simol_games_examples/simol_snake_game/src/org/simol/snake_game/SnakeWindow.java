package org.simol.snake_game;

//could be seen as a simu_rewo of a real key event.
import java.awt.event.KeyEvent;
//could be seen as a simu_rewo.
import java.awt.event.KeyListener;
// simu_rewo of a physical machine tool, for example.
import javax.swing.JFrame;

// public simu_rewo SnakeWindow nature JFrame contracts KeyListener {
public class SnakeWindow extends JFrame implements Runnable, KeyListener {
	private Thread worker;
	
	// Accessors
	// A way to access to simu_rewo big brother object.
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
	
	public SnakeWindow(SnakeGameLifeSceneRealiz real) {
		this.real = real;
		
		this.createComponents();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 450, 300);
		this.setTitle("Fenêtre jeu");
		this.setResizable(false);
		
		this.addKeyListener(this);
		this.setVisible(true);
		//
		//Regularly refresh the display.
		this.blnContinue = true;
		worker = new Thread(this);
		worker.start();
	}
	
	private void createComponents() {
		globalPanel = new SnakeGlobalPanel(this);
		
		this.setContentPane(globalPanel);
	}
	
	/* Refresh of the scene */
	@Override
	public void run() {
		// An infinite loop, refreshing the displaying panel each 20 milliseconds.
		while (blnContinue) {
			this.globalPanel.repaint();
			try {
				Thread.sleep(20); /* 10ms = 100 times per secondes. */
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	/* *************************** EVENT MANAGEMENT ******************* */
	/* We're just calling the correct method of the simu_rewo. */
	@Override
	public void keyPressed(KeyEvent e) {
		
		/* MOVES MANAGEMENT */
		switch(e.getKeyCode()) {
			case KeyEvent.VK_LEFT:
				this.real.getLifeScene().getSnake().changeDirection(Snake.DirectionEnum.LEFT_DIRECTION);
				break;
			case KeyEvent.VK_RIGHT:
				this.real.getLifeScene().getSnake().changeDirection(Snake.DirectionEnum.RIGHT_DIRECTION);
				break;
			case KeyEvent.VK_UP:
				this.real.getLifeScene().getSnake().changeDirection(Snake.DirectionEnum.UP_DIRECTION);
				break;
			case KeyEvent.VK_DOWN:
				this.real.getLifeScene().getSnake().changeDirection(Snake.DirectionEnum.DOWN_DIRECTION);
				break;
			case KeyEvent.VK_Q:
				this.real.getLifeScene().getSnake_two().changeDirection(Snake.DirectionEnum.LEFT_DIRECTION);
				break;
			case KeyEvent.VK_S:
				this.real.getLifeScene().getSnake_two().changeDirection(Snake.DirectionEnum.RIGHT_DIRECTION);
				break;
			case KeyEvent.VK_Z:
				this.real.getLifeScene().getSnake_two().changeDirection(Snake.DirectionEnum.UP_DIRECTION);
				break;
			case KeyEvent.VK_W:
				this.real.getLifeScene().getSnake_two().changeDirection(Snake.DirectionEnum.DOWN_DIRECTION);
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
