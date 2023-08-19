package actividad3.pizza;

import actividad3.pizzaElements.DoughType;
import actividad3.pizzaElements.Ingredient;
import actividad3.pizzaElements.PizzaSize;

import java.util.HashMap;

public class Pizza {
    private PizzaSize size;
    private DoughType doughType;
    private HashMap<Ingredient, Integer> ingredients;
    private boolean cheeseCrust;

    public Pizza(PizzaSize size, DoughType doughType, HashMap<Ingredient, Integer> ingredients, boolean cheeseCrust) {
        this.size = size;
        this.doughType = doughType;
        this.ingredients = ingredients;
        this.cheeseCrust = cheeseCrust;
    }

    public PizzaSize getSize() {
        return size;
    }

    public DoughType getDoughType() {
        return doughType;
    }

    public HashMap<Ingredient, Integer> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Pizza size: " + size.getName() + "\n");
        result.append("Dough type: ").append(doughType.getName()).append("\n");
        result.append("Cheese crust: ").append(cheeseCrust).append("\n");
        result.append("Ingredients: \n");
        for (Ingredient ingredient : ingredients.keySet()) {
            result.append("\t").append(ingredient.getName()).append("\n");
        }
        return result.toString();
    }
}
