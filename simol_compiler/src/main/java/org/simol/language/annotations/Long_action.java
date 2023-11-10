package org.simol.simolframework.java;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/* On a field for boolean attributes used with long action, in order to know if the action is performed. */

@Retention(RUNTIME)
@Target(FIELD)
public @interface Long_action {

}
