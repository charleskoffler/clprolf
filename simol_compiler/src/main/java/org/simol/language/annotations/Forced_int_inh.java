package org.simol.language.annotations;

import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target(value = { TYPE , TYPE_USE })
public @interface Forced_int_inh {

}