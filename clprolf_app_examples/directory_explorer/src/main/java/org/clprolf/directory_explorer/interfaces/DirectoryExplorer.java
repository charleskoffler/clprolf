package org.clprolf.directory_explorer.interfaces;

import java.nio.file.Path;

import org.clprolf.framework.java.Agent;
import org.clprolf.framework.java.Version_inh;

@Agent
@Version_inh
public interface DirectoryExplorer {
	/**
	 * Breadth-first search
	 * @param directoryPath
	 */
	public void breadthFirstFolders(Path directoryPath);
}
