package org.clprolf.framework.java;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

//Optional annotation, equivalent to @Compat_interf_version

@Retention(RUNTIME)
@Target(TYPE)
public @interface Version_inh {
	Gender value() default Gender.UNDEFINED;
}
