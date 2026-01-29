package org.clprolf.snake_game.impl;


import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.clprolf.framework.java.Nature;
import org.clprolf.framework.java.With_compat;
import org.clprolf.snake_game.impl.SnakeImpl.SnakeLink;
import org.clprolf.snake_game.interfaces.Snake;
import org.clprolf.snake_game.interfaces.SnakeGamePanel;
import org.clprolf.snake_game.interfaces.SnakeWindow;
import org.clprolf.snake_game.model.Food;
import org.clprolf.framework.java.Abstraction;
import org.clprolf.framework.java.Contracts;

/* The real drawing container. */

@Abstraction // Inherit from a system abstraction
public class SnakeGamePanelImpl extends @Nature JPanel implements @Contracts SnakeGamePanel {

	private @With_compat SnakeWindow gameWindow;
	private JLabel lblVictory;
	
	public JLabel getLblVictory() {
		return this.lblVictory;
	}

	//

	public SnakeGamePanelImpl(@With_compat  SnakeWindow fenetreJeu) {
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
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		//Display each character with the graphics object, etc.
		
		this.drawWall(g);
		this.drawSnake(g, 0);
		this.drawSnake(g, 1);
		this.displayFood(g);
		
		//
		//End the started long actions of the concerned class, for example continueFalling().
		//Here the snakes continue a step of a whole body sliding, and the long action never ends.
		this.gameWindow.getRenderer().getScene().getSnake().endLongActions();
		this.gameWindow.getRenderer().getScene().getSnake_two().endLongActions();
	}

	private void drawWall(Graphics g) {
		g.drawLine(SnakeGameSceneImpl.SCENE_COLUMNS_COUNT*10, 0, SnakeGameSceneImpl.SCENE_COLUMNS_COUNT*10, SnakeGameSceneImpl.SCENE_ROWS_COUNT*10);
		g.drawLine(0, SnakeGameSceneImpl.SCENE_ROWS_COUNT*10, SnakeGameSceneImpl.SCENE_COLUMNS_COUNT*10, SnakeGameSceneImpl.SCENE_ROWS_COUNT*10);
	}
	
	private void drawSnake(Graphics g, int snakeNumber) {
		@With_compat Snake snake;
		
		if (snakeNumber==0) {
			snake = this.gameWindow.getRenderer().getScene().getSnake();
		}
		else {
			snake = this.gameWindow.getRenderer().getScene().getSnake_two();
		}
		
		for (int linkNumber = 0;linkNumber< snake.getLinks().size();linkNumber++) {
			SnakeLink link = snake.getLinks().get(linkNumber);
			
			//Display of the link.
			switch (link.typeLink) {
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
			} 
		}
	}
	
	private void displayFood(Graphics g) {
		for (int indexNourri = 0;indexNourri< this.gameWindow.getRenderer().getScene().getFoodExpert().getFoodList().size();indexNourri++) {
			Food food;
			food = this.gameWindow.getRenderer().getScene().getFoodExpert().getFoodList().get(indexNourri);
			switch(food.getType()) {
			case ORANGE:
				g.setColor(Color.ORANGE);
				g.fillOval(food.getX()*10, food.getY()*10, 10, 10);
				break;
			case APPLE:
				g.setColor(Color.GREEN);
				g.fillOval(food.getX()*10, food.getY()*10, 10, 10);
				break;
			}
			
		}
	}
}
