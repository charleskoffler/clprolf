package org.clprolf.directory_explorer;

import java.util.List;

import org.clprolf.directory_explorer.interfaces.DirectoryExplorerWorker;
import org.clprolf.directory_explorer.model.Directory;
import org.clprolf.framework.java.Contracts;
import org.clprolf.framework.java.Worker_agent;

@Worker_agent
public class DirectoryExplorerWorkerImpl implements @Contracts DirectoryExplorerWorker {

    public void displayResult(List<Directory> foldersList){
    	
    	for (Directory currentDirect : foldersList) {
    		String displayLine = formatIdentifiant(currentDirect.getHierarchicalId()) + " : " + currentDirect.getPath();
            System.out.println(displayLine);
        }
    }
   
    // worker code.
    private String formatIdentifiant(List<Integer> identifiant) {
        return "(" + String.join(", ", identifiant.stream().map(String::valueOf).toArray(String[]::new)) + ")";
    }
}
