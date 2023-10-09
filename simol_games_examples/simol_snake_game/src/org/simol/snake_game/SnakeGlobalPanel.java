package org.simol.snake_game;

// simu_rewo
import java.awt.Color;
// simu_rewo
import java.awt.Graphics;
//simu_rewo
import javax.swing.JLabel;
//simu_rewo
import javax.swing.JPanel;

import org.simol.snake_game.Snake.SnakeLink;

/* The real drawing container. */

//public simu_rewo SnakeGlobalPanel nature JPanel
public class SnakeGlobalPanel extends JPanel {
	private SnakeWindow gameWindow;
	public JLabel lblVictory;
	
	public SnakeGlobalPanel(SnakeWindow fenetreJeu) {
		this.gameWindow = fenetreJeu;
		this.initializeComponents();
	}
	
	private void initializeComponents() {
		//For a absolute positioning.
		this.setLayout(null);
		//
		this.lblVictory = new JLabel();
		lblVictory.setBounds(50, 180, 500, 100);
		lblVictory.setVisible(true);
		this.add(lblVictory);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		//Display each character with the graphics object, etc.
		
		this.drawWall(g);
		this.drawSnake(g, 0);
		this.drawSnake(g, 1);
		this.displayFood(g);
	}

	private void drawWall(Graphics g) {
		g.drawLine(SnakeGameLifeScene.SCENE_COLUMNS_COUNT*10, 0, SnakeGameLifeScene.SCENE_COLUMNS_COUNT*10, SnakeGameLifeScene.SCENE_ROWS_COUNT*10);
		g.drawLine(0, SnakeGameLifeScene.SCENE_ROWS_COUNT*10, SnakeGameLifeScene.SCENE_COLUMNS_COUNT*10, SnakeGameLifeScene.SCENE_ROWS_COUNT*10);
	}
	
	private void drawSnake(Graphics g, int snakeNumber) {
		Snake snake;
		
		if (snakeNumber==0) {
			snake = this.gameWindow.getLifeScene().getSnake();
		}
		else {
			snake = this.gameWindow.getLifeScene().getSnake_two();
		}
		
		//No foreach, for no ConcurrentModificationException.
		//If a link is added while displaying, it doesn't matter. We will display it next time.
		for (int linkNumber = 0;linkNumber< snake.getLinks().size();linkNumber++) {
			SnakeLink link = snake.getLinks().get(linkNumber);
			
			//Display of the link.
			switch (link.typeMaillon) {
				case HEAD_LINK:
					if (snakeNumber==0) {
						g.setColor(Color.RED);
					}
					else if (snakeNumber==1) {
						g.setColor(Color.BLACK);
					}
					g.fillOval(link.x*10,  link.y*10, 10, 10);
					break;
				case FIRST_LINK:
					if (snakeNumber==0) {
						g.setColor(Color.BLUE);
					}
					else if (snakeNumber==1) {
						g.setColor(Color.GRAY);
					}
					g.fillOval(link.x*10,  link.y*10, 10, 10);
					break;
				case SECOND_LINK:
					if (snakeNumber==0) {
						g.setColor(Color.BLUE);
					}
					else if (snakeNumber==1) {
						g.setColor(Color.GRAY);
					}
					g.fillRect(link.x*10,  link.y*10, 10, 10);
					break;
				default:
					if (snakeNumber==0) {
						g.setColor(Color.RED);
					}
					else if (snakeNumber==1) {
						g.setColor(Color.GRAY);
					}
					g.fillOval(link.x*10,  link.y*10, 10, 10);
					
					break;
			} //En switch.
		} //End for
	}
	
	private void displayFood(Graphics g) {
		//No foreach, for no ConcurrentModificationException.
		//No matter if they lacks a food during display l'affichage, it will be refresh on the next display.
		for (int indexNourri = 0;indexNourri< this.gameWindow.getLifeScene().getFoodExpert().getFoodList().size();indexNourri++) {
			Food food;
			food = this.gameWindow.getLifeScene().getFoodExpert().getFoodList().get(indexNourri);
			switch(food.getType()) {
			case ORANGE_FRUIT:
				g.setColor(Color.ORANGE);
				g.fillOval(food.getX()*10, food.getY()*10, 10, 10);
				break;
			case APPLE_FRUIT:
				g.setColor(Color.GREEN);
				g.fillOval(food.getX()*10, food.getY()*10, 10, 10);
				break;
			}
			
		}
	}
}
