package org.clprolf.snake_game.interfaces;

import java.awt.Graphics;

import javax.swing.JLabel;

import org.clprolf.framework.java.Abstraction;
import org.clprolf.framework.java.Version_inh;

@Abstraction
@Version_inh
public interface SnakeGlobalPanel {
	
	public JLabel getLblVictory();

	public void paintComponent(Graphics g);

}
