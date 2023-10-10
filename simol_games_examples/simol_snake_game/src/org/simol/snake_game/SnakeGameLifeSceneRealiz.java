package org.simol.snake_game;

//Could be seen as a simu_rewo, a queue of real-world event of a physical machine tool.
import java.awt.EventQueue;

// A class for the technical realization of the life scene simu_rewo. Typically it is used for display and sound
//effects. It can be compared to a view. Other simu_alfoc can be used for other technical needs, as DAO.
// When the technical realization on computer is very simple, there's no need of a separate class, so we can put
// the technical code straight into the simu_rewo class.

/* public simu_alfoc SnakeGameLifeSceneRealiz contracts Runnable */
public class SnakeGameLifeSceneRealiz implements Runnable {
	
	// Accessors
	// A realization stuff may have kept his simu big brother
	private SnakeGameLifeScene lifeScene;
	//Just a getter
	public SnakeGameLifeScene getLifeScene() {
		return lifeScene;
	}
	
	private SnakeWindow window;
	//Just a getter
	public SnakeWindow getWindow() {
		return window;
	}

	//

	public SnakeGameLifeSceneRealiz(SnakeGameLifeScene lifeScene) {
		this.lifeScene = lifeScene;
		EventQueue.invokeLater(this);
	}
	
	// Just for the EventQueue.invokeLater().
	@Override
	public void run() {
			// Creation of the window using the dispatch thread.
			// The window will refresh itself his display, many times per seconds.
			window = new SnakeWindow(this);
	}
}
