package clprolf.wrappers.java.lang;

import org.clprolf.framework.java.Advice;
import org.clprolf.framework.java.Capacity_inh;
import org.clprolf.framework.java.Nature;

@Capacity_inh(Advice.FOR_WORKER_LIKE)
public interface ClpRunnable extends @Nature Runnable  {

}
