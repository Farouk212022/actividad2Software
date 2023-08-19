package actividad3.main;

public interface Builder {
    void setSize(PizzaSize size);
    void buildDough(DoughType doughType, boolean cheeseCrust);
    void addIngredient(Ingredient ingredient, int quantity);
    void reset();

}
