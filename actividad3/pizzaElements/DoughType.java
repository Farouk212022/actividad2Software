package actividad3.pizzaElements;

public class DoughType {
    public static final DoughType THIN = new DoughType("Thin", 1.00);
    public static final DoughType THICK = new DoughType("Thick", 1.60);
    public static final DoughType FAT_FREE = new DoughType("Fat-Free", 2.00);

    private String name;
    private double pricePerCm;

    private DoughType(String name, double pricePerCm) {
        this.name = name;
        this.pricePerCm = pricePerCm;
    }

    public String getName() {
        return name;
    }

    public double getPriceBySize(PizzaSize size) {
        return pricePerCm * size.getDiameterCm();
    }

    public double getCrustPrice() {
        return 1.50;
    }
}
