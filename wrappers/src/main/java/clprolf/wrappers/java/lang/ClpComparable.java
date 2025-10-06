package clprolf.wrappers.java.lang;

import org.clprolf.framework.java.Advice;
import org.clprolf.framework.java.Capacity_inh;

@Capacity_inh(Advice.FOR_AGENT_LIKE)
public interface ClpComparable<T> {
          public int compareTo(T o);
}
