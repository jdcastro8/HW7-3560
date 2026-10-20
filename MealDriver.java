
public class MealDriver {
    public static void main(String[] args) {
        Customer[] customers = {
            new Customer("Alex", DietPlan.NO_RESTRICTION),
            new Customer("Jordan", DietPlan.PALEO),
            new Customer("Taylor", DietPlan.VEGAN),
            new Customer("Morgan", DietPlan.NUT_ALLERGY),
            new Customer("Casey", DietPlan.PALEO),
            new Customer("Riley", DietPlan.VEGAN)
        };

        MacronutrientFactory factory = MacronutrientFactory.getInstance();

        for (Customer customer : customers) {
            System.out.println(
                customer.getName() + " - " + customer.getDietPlan()
            );

            factory.createMeal(customer).printMeal();
            System.out.println();
        }
    }
}
