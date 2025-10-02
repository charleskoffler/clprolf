package org.simol.examples.design_patterns.composite;

import java.util.ArrayList;
import java.util.List;

import org.clprolf.framework.java.Abstraction;
import org.clprolf.framework.java.Contracts;
import org.clprolf.framework.java.Forced_pract_code;
import org.clprolf.framework.java.With_compat;

@Forced_pract_code
@Abstraction
public class FolderImpl implements @Contracts Folder {
    private String name;
    private List<FileSystemComponent> children = new ArrayList<>();

    public FolderImpl(String name) {
        this.name = name;
    }

    public void add(@With_compat FileSystemComponent component) {
        children.add(component);
    }

    public void remove(@With_compat FileSystemComponent component) {
        children.remove(component);
    }

    public void done(){
        this.display();
        for (@With_compat FileSystemComponent component : children) {
            component.done();
        }
    }

    private void display() {
        System.out.println("Folder: " + name);
    }
}
