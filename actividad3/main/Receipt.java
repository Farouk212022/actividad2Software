package actividad3.main;

import java.util.HashMap;
import java.util.Map;

public class Receipt {
    private PizzaSize size;
    private DoughType dough;
    private HashMap<Ingredient, Integer> ingredients;
    private boolean cheeseCrust;

    public Receipt(PizzaSize size, DoughType dough, HashMap<Ingredient, Integer> ingredients, boolean cheeseCrust) {
        this.size = size;
        this.dough = dough;
        this.ingredients = ingredients;
        this.cheeseCrust = cheeseCrust;
    }

    public double getTotalPrice() {
        double sizePrice = dough.getPriceBySize(size);
        double ingredientsPrice = getIngredientsPrice();
        double crustPrice = cheeseCrust ? 1.5 : 0;

        return sizePrice + ingredientsPrice + crustPrice;
    }

    public double getIngredientsPrice() {
        double totalIngredientsPrice = 0;
        for (Map.Entry<Ingredient, Integer> entry : ingredients.entrySet()) {
            Ingredient ingredient = entry.getKey();
            int quantity = entry.getValue();
            totalIngredientsPrice += ingredient.getPricePerPortion() * quantity;
        }
        return totalIngredientsPrice;
    }

    @Override
    public String toString() {
        StringBuilder receipt = new StringBuilder();
        receipt.append("===========Pizza Receipt===========\n");
        receipt.append(String.format("Size: %-15s \n", size.getName()));
        receipt.append(String.format("Dough: %-14s Price: $%.2f\n", dough.getName(), dough.getPriceBySize(size)));
        receipt.append("Ingredients:\n");
        for (Map.Entry<Ingredient, Integer> entry : ingredients.entrySet()) {
            Ingredient ingredient = entry.getKey();
            int quantity = entry.getValue();
            double ingredientPrice = ingredient.getPricePerPortion() * quantity;
            receipt.append(String.format("- %-12s (x%d)   Price: $%.2f\n", ingredient.getName(), quantity, ingredientPrice));
        }
        receipt.append(String.format("Cheese Crust: %-7s Price: $%.2f\n", cheeseCrust ? "Yes" : "No", cheeseCrust ? 1.5 : 0));
        receipt.append(String.format("Total Price: $%.2f\n", getTotalPrice()));
        return receipt.toString();
    }
}
