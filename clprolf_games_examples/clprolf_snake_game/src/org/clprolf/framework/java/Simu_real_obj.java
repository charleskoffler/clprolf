package org.clprolf.framework.java;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/* Shortcut for @Simu_real_world_obj */
@Retention(RUNTIME)
@Target(TYPE)
public @interface Simu_real_obj {
	Gender value() default Gender.UNDEFINED;
}
