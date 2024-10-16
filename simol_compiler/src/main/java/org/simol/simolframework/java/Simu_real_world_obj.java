package org.simol.simolframework.java;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Simol Framework
 * 2.5 20241016 New optional annotations for interface inheritance( @Version_int and @Capacity_inh)
 * @author Charles Koffler
 *
 */

@Retention(RUNTIME)
@Target(TYPE)
public @interface Simu_real_world_obj {
	Role value() default Role.UNDEFINED;
}
