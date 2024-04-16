package by.itstep.goutor.decorators.model.data;

public class DarkRoast extends Beverage{
    public DarkRoast() {
        description = "Dark roast";
    }

    public DarkRoast(String description) {
        super(description);
    }

    @Override
    public double cost() {
        return 1.65;
    }
}
