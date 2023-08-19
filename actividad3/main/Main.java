package actividad3.main;

import actividad3.main.builders.PizzaBuilder;

public class Main{

    public static void main(String[] args) {
        PizzaBuilder pizzaBuilder = new PizzaBuilder();

        pizzaBuilder.setSize(PizzaSize.SMALL);
        pizzaBuilder.buildDough(DoughType.THIN, true);
        pizzaBuilder.addIngredient(Ingredient.HAM, 1);
        pizzaBuilder.addIngredient(Ingredient.CHEESE, 1);
        pizzaBuilder.addIngredient(Ingredient.PINEAPPLE, 1);

        Pizza pizza = pizzaBuilder.getPizza();
        Receipt receipt = pizzaBuilder.getReceipt();

        System.out.println(receipt);
    }   
}   