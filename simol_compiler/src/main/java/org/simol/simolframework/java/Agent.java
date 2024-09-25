package org.simol.simolframework.java;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Simol Framework
 * 2.3 20240920 New sub-roles: @Human_expert_static, @Expert_component_static, and @Static.
 * @author Charles Koffler
 *
 */

@Retention(RUNTIME)
@Target(TYPE)
public @interface Agent {
	Role value() default Role.UNDEFINED;
}
