package actividad1.templateMethod;

import actividad1.inventory.Inventory;
import actividad1.product.Product;


public abstract class OrderProcessingTemplate {

    public String name;
    public String type;
    public int amount;
    public int price;
    public int total;

    private Inventory inventory;

    public OrderProcessingTemplate(Inventory inventory){
        this.inventory = inventory;
    }
    public final void processOrder() {

        System.out.println("=========PROCESS "+name.toUpperCase()+" STARTS=========");
        if (checkStock()){

            System.out.println(name+" is available in the inventory");
            shipProduct();
            generateInvoice();

        }else {
            System.out.println(name+ " is not available in the inventory");
        }
        clientNotification();
        System.out.println("=========PROCESS "+name.toUpperCase()+" ENDS=========");

    }
    public void generateInvoice(){

        System.out.println();
        System.out.println("---INVOICE PROCESS STARTS---");
        addCost();
        System.out.println("The price of "+name+" is "+price+"COP");
        System.out.println("The user has a discount");
        applyDiscount();
        calculateTotal();
        System.out.println("Total price to pay is "+total+"COP discount per item included");
        System.out.println("---INVOICE PROCESS ENDS---");
        System.out.println();

    }

    public void addCost(){

        this.price = Inventory.retrieveInventory(type).price;

    }
    public void calculateTotal(){
        if(amount != 0){
            this.total = this.price * this.amount;
        }else{
            this.total = this.price;
        }
    }
    public boolean checkStock() {
        return inventory.getProductStock(product) - amount >= 0;
    }
    public void clientNotification(){
        System.out.println();
        System.out.println("Notification sent to the user");
    }
    public abstract void shipProduct();
    public abstract void applyDiscount();

}
