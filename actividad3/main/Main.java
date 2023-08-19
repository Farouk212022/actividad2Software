package actividad3.main;

import actividad3.pizza.Pizza;
import actividad3.receipt.Receipt;
import actividad3.builders.PizzaBuilder;
import actividad3.pizzaElements.DoughType;
import actividad3.pizzaElements.Ingredient;
import actividad3.pizzaElements.PizzaSize;

public class Main{

    public static void main(String[] args) {
        PizzaBuilder pizzaOrderBuilder = new PizzaBuilder();

        pizzaOrderBuilder.setSize(PizzaSize.SMALL);
        pizzaOrderBuilder.buildDough(DoughType.THIN, true);
        pizzaOrderBuilder.addIngredient(Ingredient.HAM, 1);
        pizzaOrderBuilder.addIngredient(Ingredient.CHEESE, 1);
        pizzaOrderBuilder.addIngredient(Ingredient.PINEAPPLE, 1);

        Pizza pizza = pizzaOrderBuilder.getPizza();
        System.out.println(pizza);
        Receipt receipt = pizzaOrderBuilder.getReceipt();

        System.out.println(receipt);
    }   
}   