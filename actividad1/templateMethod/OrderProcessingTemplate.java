package actividad1.templateMethod;

import actividad1.inventory.Inventory;
import actividad1.order.Order;
import actividad1.product.Product;


public abstract class OrderProcessingTemplate {
    private final Inventory inventory;

    public Order order;

    public OrderProcessingTemplate(Inventory inventory){
        this.inventory = inventory;
    }
    public final void processOrder(Product product, int amount) {
        order = new Order(product, amount);
        System.out.println("=========PROCESS "+order.getName().toUpperCase()+" STARTS=========");
        if (checkStock()){

            System.out.println(order.getName()+" is available in the inventory");
            shipProduct();
            generateInvoice();

        }else {
            System.out.println(order.getName()+ " is not available in the inventory");
        }
        clientNotification();
        System.out.println("=========PROCESS "+order.getName().toUpperCase()+" ENDS=========\n");
        order.reset();

    }
    public void generateInvoice(){

        System.out.println();
        System.out.println("---INVOICE PROCESS STARTS---");

        System.out.println("The price of "+order.getName()+" is "+order.getPrice()+"COP");
        System.out.println("The user has a discount");
        applyDiscount();
        calculateTotal();
        System.out.println("Total price to pay is "+order.total+"COP discount per item included");
        System.out.println("---INVOICE PROCESS ENDS---");
        System.out.println();

    }
    public void calculateTotal(){
        if(order.amount != 0){
            order.total = order.getPrice() * order.amount;
        }else{
            order.total = order.getPrice();
        }
    }
    public boolean checkStock() {
        return inventory.getProductStock(order.product) - order.amount >= 0;
    }
    public void clientNotification(){
        System.out.println();
        System.out.println("Notification sent to the user");
    }
    public abstract void shipProduct();
    public abstract void applyDiscount();

}
