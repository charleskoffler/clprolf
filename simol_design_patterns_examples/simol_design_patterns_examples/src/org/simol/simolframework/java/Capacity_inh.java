package org.simol.simolframework.java;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

//Optional annotation, equivalent to @Compat_interf_capacity

@Retention(RUNTIME)
@Target(TYPE)
public @interface Capacity_inh {

}
