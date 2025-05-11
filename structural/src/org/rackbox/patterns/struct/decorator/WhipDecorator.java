package org.rackbox.patterns.struct.decorator;

public class WhipDecorator extends CoffeeDecorator {

    public WhipDecorator(Coffeee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", whip";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.7;
    }
}
