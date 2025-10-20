package org.clprolf.directory_explorer.interfaces;

import java.util.List;

import org.clprolf.directory_explorer.model.Directory;
import org.clprolf.framework.java.Version_inh;
import org.clprolf.framework.java.Worker_agent;

@Worker_agent
@Version_inh
public interface DirectoryExplorerWorker {
	public void displayResult(List<Directory> foldersList);
}
