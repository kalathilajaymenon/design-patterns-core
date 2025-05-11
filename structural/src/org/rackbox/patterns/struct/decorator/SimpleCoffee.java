package org.rackbox.patterns.struct.decorator;

public class SimpleCoffee implements ICoffee{
    @Override
    public String getDescription() {
        return "Simple coffee";
    }

    @Override
    public double getCost() {
        return 1.0;
    }
}
