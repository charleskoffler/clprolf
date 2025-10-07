package org.clprolf.examples.design_patterns.composite;

import org.clprolf.framework.java.Worker_agent;

@Worker_agent
public class CompositePatternLauncher {
    public static void main(String[] args) {
        FolderImpl root = new FolderImpl("Root");
        FolderImpl documents = new FolderImpl("Documents");
        FolderImpl pictures = new FolderImpl("Pictures");
        FileImpl file1 = new FileImpl("File1.txt");
        FileImpl file2 = new FileImpl("File2.jpg");
        FileImpl file3 = new FileImpl("File3.docx");

        documents.add(file1);
        pictures.add(file2);
        documents.add(file3);
        root.add(documents);
        root.add(pictures);

        root.done();
    }
}
