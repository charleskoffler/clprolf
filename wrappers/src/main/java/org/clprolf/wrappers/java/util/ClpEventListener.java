package org.clprolf.wrappers.java.util;

import java.util.EventListener;

import org.clprolf.framework.java.Advice;
import org.clprolf.framework.java.Capacity_inh;
import org.clprolf.framework.java.Nature;

@Capacity_inh(Advice.FOR_AGENT_LIKE) //For an agent observer
public interface ClpEventListener extends @Nature EventListener {

}
