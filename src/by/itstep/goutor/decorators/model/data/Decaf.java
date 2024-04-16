package by.itstep.goutor.decorators.model.data;

public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf";
    }

    public Decaf(String description) {
        super(description);
    }

    @Override
    public double cost() {
        return 1.70;
    }

}
