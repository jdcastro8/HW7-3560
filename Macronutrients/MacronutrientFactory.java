public class MacronutrientFactory implements AbstractMealFactory {
    private static final MacronutrientFactory INSTANCE = new MacronutrientFactory();

    private MacronutrientFactory() {}

    public static MacronutrientFactory getInstance() {
        return INSTANCE;
    }

    @Override
    public FoodFactory createCarbFactory() {
        return CarbFactory.getInstance();
    }

    @Override
    public FoodFactory createProteinFactory() {
        return ProteinFactory.getInstance();
    }

    @Override
    public FoodFactory createFatFactory() {
        return FatFactory.getInstance();
    }

    public Meal createMeal(Customer customer) {
        DietPlan diet = customer.getDietPlan();

        return new Meal(
            createCarbFactory().createFood(diet),
            createProteinFactory().createFood(diet),
            createFatFactory().createFood(diet)
        );
    }
}
