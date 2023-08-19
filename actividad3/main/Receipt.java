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
        receipt.append("Receipt\n");
        receipt.append("Size: ").append(size.getName()).append("\n");
        receipt.append("Dough: ").append(dough.getName()).append("\n");
        receipt.append("Ingredients:\n");
        for (Map.Entry<Ingredient, Integer> entry : ingredients.entrySet()) {
            Ingredient ingredient = entry.getKey();
            int quantity = entry.getValue();
            receipt.append("- ").append(ingredient.getName()).append(": ").append(quantity).append("\n");
        }
        receipt.append("Cheese Crust: ").append(cheeseCrust ? "Yes" : "No").append("\n");
        receipt.append("Total Price: $").append(getTotalPrice()).append("\n");
        return receipt.toString();
    }
}
