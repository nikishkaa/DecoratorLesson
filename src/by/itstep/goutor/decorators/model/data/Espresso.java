package by.itstep.goutor.decorators.model.data;

public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    public Espresso(String description) {
        super(description);
    }

    @Override
    public double cost() {
        return 1.90;
    }
}
