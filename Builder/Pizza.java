
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pizza {
    private final String chain;
    private final String size;
    private final List<String> toppings;

    private Pizza(Builder builder) {
        chain = builder.chain;
        size = builder.size;
        toppings = Collections.unmodifiableList(new ArrayList<>(builder.toppings));
    }

    public void eat() {
        System.out.println(chain + " - " + size + " pizza");
        System.out.println("Toppings: " + String.join(", ", toppings));
        System.out.println();
    }

    public static class Builder {
        private static final List<String> VALID_TOPPINGS = List.of(
            "Pepperoni", "Sausage", "Mushrooms", "Bacon", "Onions", "Extra Cheese",
            "Peppers", "Chicken", "Olives", "Spinach", "Tomato and Basil", "Beef",
            "Ham", "Pesto", "Spicy Pork", "Ham and Pineapple"
        );

        private final String chain;
        private final String size;
        private final List<String> toppings = new ArrayList<>();

        public Builder(String chain, String size) {
            if (!List.of("Pizza Hut", "Little Caesars", "Dominos").contains(chain))
                throw new IllegalArgumentException("Unknown pizza chain");
            if (!List.of("Small", "Medium", "Large").contains(size))
                throw new IllegalArgumentException("Size must be Small, Medium, or Large");

            this.chain = chain;
            this.size = size;
        }

        public Builder addTopping(String topping) {
            if (!VALID_TOPPINGS.contains(topping))
                throw new IllegalArgumentException("Invalid topping: " + topping);
            if (toppings.contains(topping))
                throw new IllegalArgumentException("Duplicate topping: " + topping);

            toppings.add(topping);
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}
