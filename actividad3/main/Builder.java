package actividad3.main;

import actividad3.pizzaElements.DoughType;
import actividad3.pizzaElements.Ingredient;
import actividad3.pizzaElements.PizzaSize;

public interface Builder {
    void setSize(PizzaSize size);
    void buildDough(DoughType doughType, boolean cheeseCrust);
    void addIngredient(Ingredient ingredient, int quantity);
    void reset();

}
