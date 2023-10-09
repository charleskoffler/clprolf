package org.simol.snake_game;

//could be seen as a simu_rewo of a real key event.
import java.awt.event.KeyEvent;
//could be seen as a simu_rewo.
import java.awt.event.KeyListener;
// simu_rewo of a physical machine tool, for example.
import javax.swing.JFrame;

// public simu_rewo SnakeWindow nature JFrame contracts Runnable, KeyListener {
public class SnakeWindow extends JFrame implements Runnable, KeyListener {
	// Accessors
	private SnakeGameLifeScene lifeScene;
	
	public SnakeGameLifeScene getLifeScene() {
		return lifeScene;
	}

	public void setLifeScene(SnakeGameLifeScene lifeScene) {
		this.lifeScene = lifeScene;
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
	
	public SnakeWindow(SnakeGameLifeScene sceneVie) {
		this.lifeScene = sceneVie;
		
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
		Thread timer = new Thread(this);
		timer.start();
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
				this.lifeScene.getSnake().changeDirection(Snake.DirectionEnum.LEFT_DIRECTION);
				break;
			case KeyEvent.VK_RIGHT:
				this.lifeScene.getSnake().changeDirection(Snake.DirectionEnum.RIGHT_DIRECTION);
				break;
			case KeyEvent.VK_UP:
				this.lifeScene.getSnake().changeDirection(Snake.DirectionEnum.UP_DIRECTION);
				break;
			case KeyEvent.VK_DOWN:
				this.lifeScene.getSnake().changeDirection(Snake.DirectionEnum.DOWN_DIRECTION);
				break;
			case KeyEvent.VK_Q:
				this.lifeScene.getSnake_two().changeDirection(Snake.DirectionEnum.LEFT_DIRECTION);
				break;
			case KeyEvent.VK_S:
				this.lifeScene.getSnake_two().changeDirection(Snake.DirectionEnum.RIGHT_DIRECTION);
				break;
			case KeyEvent.VK_Z:
				this.lifeScene.getSnake_two().changeDirection(Snake.DirectionEnum.UP_DIRECTION);
				break;
			case KeyEvent.VK_W:
				this.lifeScene.getSnake_two().changeDirection(Snake.DirectionEnum.DOWN_DIRECTION);
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
