
public class Meal {
    private final String carbs;
    private final String protein;
    private final String fats;

    public Meal(String carbs, String protein, String fats) {
        this.carbs = carbs;
        this.protein = protein;
        this.fats = fats;
    }

    public void printMeal() {
        System.out.println("Carbs: " + carbs);
        System.out.println("Protein: " + protein);
        System.out.println("Fats: " + fats);
    }
}
