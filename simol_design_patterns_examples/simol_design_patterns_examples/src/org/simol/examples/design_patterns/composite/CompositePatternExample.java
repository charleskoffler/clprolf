//!!! This is generated files with simol compiler, and formatted with Eclipse source->format feature
package org.simol.examples.design_patterns.composite;

public class CompositePatternExample {
	public static void main(String[] args) {
		Folder root = new Folder("Root");
		Folder documents = new Folder("Documents");
		Folder pictures = new Folder("Pictures");
		File file1 = new File("File1.txt");
		File file2 = new File("File2.jpg");
		File file3 = new File("File3.docx");
		documents.add(file1);
		pictures.add(file2);
		documents.add(file3);
		root.add(documents);
		root.add(pictures);
		root.display();
	}
}