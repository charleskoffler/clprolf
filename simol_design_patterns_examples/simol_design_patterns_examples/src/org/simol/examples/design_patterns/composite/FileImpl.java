package org.simol.examples.design_patterns.composite;

import org.clprolf.framework.java.Abstraction;
import org.clprolf.framework.java.Contracts;
import org.clprolf.framework.java.Forced_pract_code;

@Forced_pract_code
@Abstraction
public class FileImpl implements @Contracts File {
    private String name;

    public FileImpl(String name) {
        this.name = name;
    }

    public void done(){
        this.display();
    }

    private void display() {
        System.out.println("File: " + name);
    }
}
