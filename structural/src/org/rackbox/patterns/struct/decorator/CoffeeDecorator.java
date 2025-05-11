package org.rackbox.patterns.struct.decorator;

/**
 * Abstract decorator class that implements the ICoffee interface.
 * It contains a reference to an ICoffee object and delegates the method calls to it.
 */
public abstract class CoffeeDecorator implements Coffeee {

    private final Coffeee coffee;

    public CoffeeDecorator(Coffeee coffee) {
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
