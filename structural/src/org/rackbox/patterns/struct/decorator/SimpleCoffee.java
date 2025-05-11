package org.rackbox.patterns.struct.decorator;

public class SimpleCoffee implements Coffeee {
    @Override
    public String getDescription() {
        return "Simple coffee";
    }

    @Override
    public double getCost() {
        return 1.0;
    }
}
