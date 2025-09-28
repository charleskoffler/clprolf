package org.clprolf.language.annotations;

import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

//Above a compat_interf_capacity, or capacity_inh definition.

@Retention(RUNTIME)
@Target(value = { TYPE , TYPE_USE })
public @interface Agent_like_advice {

}