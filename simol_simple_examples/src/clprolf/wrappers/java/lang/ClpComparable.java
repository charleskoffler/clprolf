package clprolf.wrappers.java.lang;

import org.simol.simolframework.java.Advice;
import org.simol.simolframework.java.Compat_interf_capacity;

@Compat_interf_capacity(Advice.FOR_AGENT_LIKE)
public interface ClpComparable<T> {
          public int compareTo(T o);
}