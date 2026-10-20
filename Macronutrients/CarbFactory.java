
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class CarbFactory implements FoodFactory {
    private static final CarbFactory INSTANCE = new CarbFactory();

    private CarbFactory() {}

    public static CarbFactory getInstance() {
        return INSTANCE;
    }

    @Override
    public String createFood(DietPlan dietPlan) {
        List<String> options = new ArrayList<>(
            List.of("Cheese", "Bread", "Lentils", "Pistachio")
        );

        if (dietPlan == DietPlan.PALEO)
            options.retainAll(List.of("Pistachio"));

        if (dietPlan == DietPlan.VEGAN)
            options.remove("Cheese");

        if (dietPlan == DietPlan.NUT_ALLERGY)
            options.remove("Pistachio");

        return options.get(
            ThreadLocalRandom.current().nextInt(options.size())
        );
    }
}
