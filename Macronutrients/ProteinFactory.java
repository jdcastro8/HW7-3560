
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ProteinFactory implements FoodFactory {
    private static final ProteinFactory INSTANCE = new ProteinFactory();

    private ProteinFactory() {}

    public static ProteinFactory getInstance() {
        return INSTANCE;
    }

    @Override
    public String createFood(DietPlan dietPlan) {
        List<String> options = new ArrayList<>(
            List.of("Fish", "Chicken", "Beef", "Tofu")
        );

        if (dietPlan == DietPlan.PALEO)
            options.remove("Tofu");

        if (dietPlan == DietPlan.VEGAN)
            options.removeAll(List.of("Fish", "Chicken", "Beef"));

        return options.get(
            ThreadLocalRandom.current().nextInt(options.size())
        );
    }
}
