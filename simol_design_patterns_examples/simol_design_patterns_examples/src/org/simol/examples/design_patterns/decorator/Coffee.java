package org.simol.examples.design_patterns.decorator;

import org.simol.simolframework.java.Compat_interf_capacity;

//public compat_interf_capacity Coffee
@Compat_interf_capacity
public interface Coffee {
    public double getCost();
    public String getDescription();
}
