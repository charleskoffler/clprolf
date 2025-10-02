package org.simol.examples.design_patterns.composite;

import org.clprolf.framework.java.Abstraction;
import org.clprolf.framework.java.Nature;
import org.clprolf.framework.java.Version_inh;
import org.clprolf.framework.java.With_compat;

@Abstraction
@Version_inh
public interface Folder extends @Nature FileSystemComponent {
	 public void add(@With_compat FileSystemComponent component);
	       
	 public void remove(@With_compat FileSystemComponent component);
	      
}
