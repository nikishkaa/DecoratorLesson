package by.itstep.goutor.decorators.model.data.condiment;

import by.itstep.goutor.decorators.model.data.Beverage;

public class Whip extends CondimentDecorator {
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.25;
    }
}
