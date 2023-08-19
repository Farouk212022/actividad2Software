package actividad3.main;

public class Ingredient {
    public static final Ingredient CHEESE = new Ingredient("Cheese", 0.50);
    public static final Ingredient PEPPERONI = new Ingredient("Pepperoni", 1.00);
    public static final Ingredient HAM = new Ingredient("Ham", 0.75);
    public static final Ingredient MUSHROOMS = new Ingredient("Mushrooms", 0.80);
    public static final Ingredient PEPPERS = new Ingredient("Peppers", 0.60);
    public static final Ingredient ONION = new Ingredient("Onion", 0.70);
    public static final Ingredient OLIVES = new Ingredient("Olives", 0.85);
    public static final Ingredient PINEAPPLE = new Ingredient("Pineapple", 0.95);

    private String name;
    private double pricePerPortion;

    private Ingredient(String name, double price) {
        this.name = name;
        this.pricePerPortion = price;
    }

    public String getName() {
        return name;
    }

    public double getPricePerPortion() {
        return pricePerPortion;
    }

}
