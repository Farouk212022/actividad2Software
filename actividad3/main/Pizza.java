package actividad3.main;

import java.util.HashMap;

public class Pizza {
    private PizzaSize size;
    private DoughType dough;
    private HashMap<Ingredient, Integer> ingredients;
    private boolean cheeseCrust;

    public Pizza(PizzaSize size, DoughType dough, HashMap<Ingredient, Integer> ingredients, boolean cheeseCrust) {
        this.size = size;
        this.dough = dough;
        this.ingredients = ingredients;
        this.cheeseCrust = cheeseCrust;
    }

    public PizzaSize getSize() {
        return size;
    }

    public DoughType getDough() {
        return dough;
    }

    public HashMap<Ingredient, Integer> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Pizza size: " + size.getName() + "\n");
        result.append("Dough type: ").append(dough.getName()).append("\n");
        result.append("Cheese crust: ").append(cheeseCrust).append("\n");
        result.append("Ingredients: \n");
        for (Ingredient ingredient : ingredients.keySet()) {
            result.append("\t").append(ingredient.getName()).append("\n");
        }
        return result.toString();
    }
}
