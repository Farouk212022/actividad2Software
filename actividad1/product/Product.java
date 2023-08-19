package actividad1.product;

public class Product {
    public static final Product HAMBURGER = new Product("Hamburger", 8000);
    public static final Product PIZZA = new Product("Pizza", 4000);
    public static final Product HOTDOG = new Product("Hot Dog", 5000);

    public static final Product SKIRT = new Product("Skirt", 30000);
    public static final Product JEANS = new Product("Jean", 50000);
    public static final Product POLO = new Product("Polo", 40000);


    public static final Product SMARTTV = new Product("SmartTV", 350000);

    public static final Product COMPUTER = new Product("Computer", 500000);

    public static final Product AIRPODS = new Product("Airpods", 600000);

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


    public void setPrice(int price) {
        this.price = price;
    }

    public void reset() {
        this.name = null;
        this.price = 0;
    }
}
