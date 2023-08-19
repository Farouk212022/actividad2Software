package actividad1.product;

public class Product {
    public static final Product HAMBURGER = new Product("Hamburger", 8000);
    public static final Product PIZZA = new Product("Pizza", 4000);
    public static final Product HOTDOG = new Product("Hot Dog", 5000);

    public String name;
    public int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
