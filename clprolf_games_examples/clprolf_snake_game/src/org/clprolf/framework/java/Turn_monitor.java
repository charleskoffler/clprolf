package org.clprolf.framework.java;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/* @Long_action to replace the simol method modifie "long_action", but for the @Long_action simol annotation on
 * fields too. */

@Retention(RUNTIME)
@Target(value= {FIELD})
public @interface Turn_monitor {

}
