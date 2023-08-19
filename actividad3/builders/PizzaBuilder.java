package actividad3.builders;

import actividad3.main.Builder;
import actividad3.pizza.Pizza;
import actividad3.receipt.Receipt;
import actividad3.pizzaElements.DoughType;
import actividad3.pizzaElements.Ingredient;
import actividad3.pizzaElements.PizzaSize;

import java.util.HashMap;

public class PizzaBuilder implements Builder {
    private PizzaSize size;
    private DoughType doughType;
    private boolean cheeseCrust;
    private HashMap<Ingredient, Integer> ingredients;

    public PizzaBuilder() {
        this.ingredients = new HashMap<>();
    }
    @Override
    public void setSize(PizzaSize size) {
        this.size = size;
    }

    @Override
    public void buildDough(DoughType doughType, boolean cheeseCrust) {
        this.doughType = doughType;
        this.cheeseCrust = cheeseCrust;
    }

    @Override
    public void addIngredient(Ingredient ingredient, int quantity) {
        this.ingredients.put(ingredient, quantity);
    }

    public Pizza getPizza() {
        return new Pizza(this.size, this.doughType, this.ingredients, this.cheeseCrust);
    }

    public Receipt getReceipt() {
        return new Receipt(this.size, this.doughType, this.ingredients, this.cheeseCrust);
    }

    @Override
    public void reset() {
        this.ingredients = new HashMap<>();
        this.size = null;
        this.doughType = null;
    }
}
