package org.clprolf.snake_game.interfaces;

import java.util.ArrayList;
import java.util.Random;

import org.clprolf.framework.java.Agent;
import org.clprolf.framework.java.Long_action;
import org.clprolf.framework.java.Version_inh;
import org.clprolf.snake_game.impl.SnakeImpl;
import org.clprolf.snake_game.impl.SnakeImpl.SlidingType;
import org.clprolf.snake_game.impl.SnakeImpl.SnakeLink;

@Agent
@Version_inh
public interface Snake {
	public int getSpeed();
	
	public void setLastSlidingType(SlidingType lastSlidingType);

	public ArrayList<SnakeLink> getLinks();

	public void setLinks(ArrayList<SnakeLink> links);

	public String getColor();
	public void setColor(String color);
	
	@Long_action
	public void makeSliding();
	
	public SnakeLink getLinkAt(int x, int y, SnakeImpl snake);
	
	public void increaseSpeed();

	public void decreaseSpeed();

	@Long_action
	public void endLongActions();
}
