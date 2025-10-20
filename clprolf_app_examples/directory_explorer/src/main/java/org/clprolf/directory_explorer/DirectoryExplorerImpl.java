package org.clprolf.directory_explorer;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

import org.clprolf.directory_explorer.interfaces.DirectoryExplorer;
import org.clprolf.directory_explorer.interfaces.DirectoryExplorerWorker;
import org.clprolf.directory_explorer.model.Directory;
import org.clprolf.framework.java.Agent;
import org.clprolf.framework.java.Contracts;
import org.clprolf.framework.java.With_compat;

@Agent
public class DirectoryExplorerImpl implements @Contracts DirectoryExplorer {

		private @With_compat DirectoryExplorerWorker worker;
		
		public DirectoryExplorerImpl() {
			this.worker = new DirectoryExplorerWorkerImpl();
		}

	    public void breadthFirstFolders(@With_compat Path directoryPath) {
	    	directoryPath = directoryPath.normalize().toAbsolutePath();
	    	
	    	@With_compat List<Directory> foldersList = new ArrayList<>();
	        @With_compat Queue<Directory> directoryToExplore = new LinkedList<>();

	        directoryToExplore.add(new Directory(directoryPath, List.of(0)));
	        
	        while (!directoryToExplore.isEmpty()) {
	            Directory courant = directoryToExplore.poll();

	            foldersList.add(courant);

	            File[] fichiers = courant.getPath().toFile().listFiles();
	            if (fichiers != null) {
	                int index = 0;
	                
	                for (File fichier : fichiers) {
	                    if (fichier.isDirectory()) {
	                        
	                        List<Integer> nouvelIdentifiant = new ArrayList<>(courant.getHierarchicalId());
	                        nouvelIdentifiant.add(index);
	                        //Job to do later.
	                        directoryToExplore.add(new Directory(fichier.toPath().normalize().toAbsolutePath(), nouvelIdentifiant));
	                        index++;
	                    }
	                }
	            }
	        }

	        worker.displayResult(foldersList);
	    }
	    
}
