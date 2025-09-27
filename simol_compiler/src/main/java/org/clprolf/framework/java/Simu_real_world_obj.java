package org.clprolf.framework.java;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Simol Framework
 * 3.0 20240428 Added role in version_inh(correction)
 * @author Charles Koffler
 *
 */

@Retention(RUNTIME)
@Target(TYPE)
public @interface Simu_real_world_obj {
	Gender value() default Gender.UNDEFINED;
}
