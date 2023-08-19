package actividad1.order;

import actividad1.product.Product;

public class Order {
    public int amount;
    public int total;
    public Product product;

    public Order(Product product, int amount){
        this.product = product;
        this.amount = amount;
    }

    public int getPrice(){
        return product.getPrice();
    }

    public String getName(){
        return product.getName();
    }

    public void reset(){
        this.amount = 0;
        this.total = 0;
        product.reset();
    }

    public void setPrice(int price) {
        product.setPrice(price);
    }
}
