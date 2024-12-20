package org.simol.simolframework.java;

import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target(value = { TYPE })
public @interface Forced_pract_code {

}