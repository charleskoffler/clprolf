package org.clprolf.framework.java;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 *	v3.1 20250928 Cleanup: removed 5 synonym annotations, keeping only aspect-based keywords
 */

@Retention(RUNTIME)
@Target(TYPE)
public @interface Agent_abstraction {
	Gender value() default Gender.UNDEFINED;
}
