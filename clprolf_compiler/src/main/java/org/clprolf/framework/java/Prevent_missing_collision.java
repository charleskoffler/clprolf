package org.clprolf.framework.java;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Replace the prevent_missing_collision method modifier of simol, and the @Prevent_missing_collision on attributes.
 * @author
 *
 */
@Retention(RUNTIME)
@Target(value= {METHOD})
public @interface Prevent_missing_collision {

}
