package actividad3.main.builders;

import actividad3.main.*;

import java.util.HashMap;
import java.util.List;

public class PizzaBuilder implements Builder {
    private PizzaSize size;
    private DoughType doughType;

    private boolean cheeseCrust;
    private HashMap<Ingredient, Integer> ingredients;

    private final List<Ingredient> allowedIngredients;

    public PizzaBuilder(List<Ingredient> allowedIngredients) {
        this.ingredients = new HashMap<>();
        this.allowedIngredients = allowedIngredients;
    }
    @Override
    public void setSize(PizzaSize size) {
        this.size = size;
    }

    @Override
    public void buildDough(DoughType doughType, boolean cheeseCrust) {
        this.doughType = doughType;
    }

    @Override
    public void addIngredient(Ingredient ingredient, int quantity) {
        this.ingredients.put(ingredient, quantity);
    }

    public Pizza getResult() {
        return new Pizza(this.size, this.doughType, this.ingredients, this.cheeseCrust);
    }

    @Override
    public void reset() {
        this.ingredients = new HashMap<>();
        this.size = null;
        this.doughType = null;
    }
}
