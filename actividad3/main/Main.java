package actividad3.main;

import actividad3.main.builders.PizzaBuilder;
import

public class Main{

    public static void main(String[] args) {
        PizzaBuilder pizzaBuilder = new PizzaBuilder();
        pizzaBuilder.setSize(PizzaSize.SMALL);
        pizzaBuilder.buildDough(DoughType.THIN, true);
        pizzaBuilder.addIngredient(Ingredient.HAM, 1);
        Pizza pizza = pizzaBuilder.getResult();
        System.out.println(pizza);
    }   
}   