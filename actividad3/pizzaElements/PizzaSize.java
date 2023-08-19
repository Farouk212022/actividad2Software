package actividad3.pizzaElements;

public class PizzaSize {
    public static final PizzaSize SMALL = new PizzaSize("Small", 8);
    public static final PizzaSize MEDIUM = new PizzaSize("Medium", 10);
    public static final PizzaSize LARGE = new PizzaSize("Large", 12);

    private String name;
    private int diameterCm;

    private PizzaSize(String name, int diameterCm) {
        this.name = name;
        this.diameterCm = diameterCm;
    }

    public String getName() {
        return name;
    }

    public int getDiameterCm() {
        return diameterCm;
    }
}
