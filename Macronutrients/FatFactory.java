
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class FatFactory implements FoodFactory {
    private static final FatFactory INSTANCE = new FatFactory();

    private FatFactory() {}

    public static FatFactory getInstance() {
        return INSTANCE;
    }

    @Override
    public String createFood(DietPlan dietPlan) {
        List<String> options = new ArrayList<>(
            List.of("Avocado", "Sour cream", "Tuna", "Peanuts")
        );

        if (dietPlan == DietPlan.PALEO)
            options.remove("Sour cream");

        if (dietPlan == DietPlan.VEGAN)
            options.removeAll(List.of("Sour cream", "Tuna"));

        if (dietPlan == DietPlan.NUT_ALLERGY)
            options.remove("Peanuts");

        return options.get(
            ThreadLocalRandom.current().nextInt(options.size())
        );
    }
}
