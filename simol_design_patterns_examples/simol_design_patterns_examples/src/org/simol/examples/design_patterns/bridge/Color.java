package org.simol.examples.design_patterns.bridge;

// We chose a compat_interf_version because the aim is to loose coupling. We don't want to use a concrete class for
// the polymorphism, in a future eventuel case of other implementation used.
// public compat_interf_version Color
public interface Color {
	 void applyColor();
}
