package org.clprolf.framework.java;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/*
 * Shortcut for @Model_real_world_obj
 */
@Retention(RUNTIME)
@Target(TYPE)
public @interface Model_real_obj {

}
