package by.itstep.goutor.decorators.model.data.condiment;

import by.itstep.goutor.decorators.model.data.Beverage;

public class Mocha extends CondimentDecorator {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.50;
    }
}
