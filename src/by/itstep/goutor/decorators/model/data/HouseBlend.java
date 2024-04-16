package by.itstep.goutor.decorators.model.data;

public class HouseBlend extends Beverage{
    public HouseBlend() {
        description = "House blend";
    }

    public HouseBlend(String description) {
        super(description);
    }

    @Override
    public double cost() {
        return 1.50;
    }
}
