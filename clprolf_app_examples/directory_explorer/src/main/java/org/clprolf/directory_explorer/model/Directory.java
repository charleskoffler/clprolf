package org.clprolf.directory_explorer.model;

import java.nio.file.Path;
import java.util.List;

import org.clprolf.framework.java.Model;

@Model
public class Directory {
    private Path path;
    
	private List<Integer> hierarchicalId;

	public Path getPath() {
		return path;
	}

	public void setPath(Path thePath) {
		this.path = thePath;
	}

	public List<Integer> getHierarchicalId() {
		return hierarchicalId;
	}

	public void setHierarchicalId(List<Integer> hierarchicalId) {
		this.hierarchicalId = hierarchicalId;
	}

	
    public Directory(Path thePath, List<Integer> identifiant) {
        this.path = thePath;
        this.hierarchicalId = identifiant;
    }
     
}
