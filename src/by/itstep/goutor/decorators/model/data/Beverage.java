package by.itstep.goutor.decorators.model.data;

public abstract class Beverage {
    protected String description;

    public Beverage() {
        description = "no description";
    }

    public Beverage(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    @Override
    public String toString() {
        return description;
    }
}
