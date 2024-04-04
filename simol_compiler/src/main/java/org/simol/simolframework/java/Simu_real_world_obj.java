package org.simol.simolframework.java;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Simol Framework
 * 2.1 20240404 Correction about Abstraction annotation.
 * @author Charles Koffler
 *
 */

@Retention(RUNTIME)
@Target(TYPE)
public @interface Simu_real_world_obj {
	Role value() default Role.UNDEFINED;
}
