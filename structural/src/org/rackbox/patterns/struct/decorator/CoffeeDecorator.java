package org.rackbox.patterns.struct.decorator;

/**
 * Abstract decorator class that implements the ICoffee interface.
 * It contains a reference to an ICoffee object and delegates the method calls to it.
 */
public abstract class CoffeeDecorator implements ICoffee {

    private final ICoffee coffee;

    public CoffeeDecorator(ICoffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }

    @Override
    public double getCost() {
        return coffee.getCost();
    }
}
