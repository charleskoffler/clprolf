//!!! This is generated files with simol compiler, and formatted with Eclipse source->format feature
package org.simol.examples.design_patterns.composite;

import java.util.ArrayList;
import java.util.List;

class Folder implements FileComponent {
	private String name;
	private List<FileComponent> children = new ArrayList<>();

	public Folder(String name) {
		this.name = name;
	}

	public void add(FileComponent component) {
		children.add(component);
	}

	public void remove(FileComponent component) {
		children.remove(component);
	}

	public void display() {
		System.out.println("Folder: " + name);
		for (FileComponent component : children) {
			component.display();
		}
	}
}