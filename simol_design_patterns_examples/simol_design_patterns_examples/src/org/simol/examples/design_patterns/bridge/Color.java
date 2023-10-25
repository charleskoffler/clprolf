package org.simol.examples.design_patterns.bridge;

import org.simol.simolframework.java.Compat_interf_version;

// We chose a compat_interf_version because the aim is to loose coupling. We don't want to use a concrete class for
// the polymorphism, in a future eventuel case of other implementation used.
// public compat_interf_version Color
@Compat_interf_version
public interface Color {
	 void applyColor();
}
