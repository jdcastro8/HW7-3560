
public class PizzaDriver {
    public static void main(String[] args) {
        System.out.println("PART 1 - PIZZA HUT");

        new Pizza.Builder("Pizza Hut", "Small")
            .addTopping("Pepperoni")
            .addTopping("Mushrooms")
            .addTopping("Olives")
            .build().eat();

        new Pizza.Builder("Pizza Hut", "Medium")
            .addTopping("Sausage")
            .addTopping("Bacon")
            .addTopping("Onions")
            .addTopping("Peppers")
            .addTopping("Extra Cheese")
            .addTopping("Chicken")
            .build().eat();

        new Pizza.Builder("Pizza Hut", "Large")
            .addTopping("Pepperoni")
            .addTopping("Sausage")
            .addTopping("Mushrooms")
            .addTopping("Bacon")
            .addTopping("Onions")
            .addTopping("Extra Cheese")
            .addTopping("Peppers")
            .addTopping("Olives")
            .addTopping("Spinach")
            .build().eat();

        System.out.println("PART 2 - THREE CHAINS");

        new Pizza.Builder("Pizza Hut", "Large")
            .addTopping("Pepperoni")
            .addTopping("Bacon")
            .addTopping("Onions")
            .build().eat();

        new Pizza.Builder("Pizza Hut", "Small")
            .addTopping("Ham and Pineapple")
            .addTopping("Pesto")
            .build().eat();

        new Pizza.Builder("Little Caesars", "Medium")
            .addTopping("Pepperoni")
            .addTopping("Sausage")
            .addTopping("Mushrooms")
            .addTopping("Bacon")
            .addTopping("Onions")
            .addTopping("Peppers")
            .addTopping("Olives")
            .addTopping("Extra Cheese")
            .build().eat();

        new Pizza.Builder("Little Caesars", "Small")
            .addTopping("Chicken")
            .addTopping("Pesto")
            .addTopping("Spinach")
            .addTopping("Tomato and Basil")
            .addTopping("Olives")
            .addTopping("Extra Cheese")
            .build().eat();

        new Pizza.Builder("Dominos", "Small")
            .addTopping("Pepperoni")
            .build().eat();

        new Pizza.Builder("Dominos", "Large")
            .addTopping("Beef")
            .addTopping("Spicy Pork")
            .addTopping("Peppers")
            .build().eat();
    }
}
