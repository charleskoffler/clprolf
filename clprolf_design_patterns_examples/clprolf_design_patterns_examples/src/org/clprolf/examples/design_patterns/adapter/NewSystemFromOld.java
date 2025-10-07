package org.clprolf.examples.design_patterns.adapter;

import org.clprolf.framework.java.Contracts;
import org.clprolf.framework.java.Worker_agent;

//Adapter class of the design pattern, that adapts OldSystem to NewSystem interface
//public simu_comp_as_worker NewSystemFromOld contracts NewSystem
@Worker_agent
public class NewSystemFromOld implements @Contracts NewSystem {
 private OldSystem oldSystem;

 public NewSystemFromOld(OldSystem oldSystem) {
     this.oldSystem = oldSystem;
 }

 @Override
 public void newMethod() {
     // Call the old method from the adapted class
     oldSystem.oldMethod();
 }
}
