package by.itstep.goutor.decorators.model.data.condiment;

import by.itstep.goutor.decorators.model.data.Beverage;

public abstract class CondimentDecorator extends Beverage {
    @Override
    public abstract String getDescription();
}
