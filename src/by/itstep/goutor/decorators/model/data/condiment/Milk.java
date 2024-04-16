package by.itstep.goutor.decorators.model.data.condiment;

import by.itstep.goutor.decorators.model.data.Beverage;

public class Milk extends CondimentDecorator {
    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }
}
