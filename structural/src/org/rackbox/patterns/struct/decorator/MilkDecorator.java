package org.rackbox.patterns.struct.decorator;

public class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffeee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", milk";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5;
    }
}
