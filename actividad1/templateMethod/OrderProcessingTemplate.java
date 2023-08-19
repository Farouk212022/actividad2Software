package actividad1.templateMethod;

import actividad1.inventory.Inventory;


public abstract class OrderProcessingTemplate {

    public String name;
    public String type;
    public int amount;
    public int price;
    public int total;

    public OrderProcessingTemplate(){}
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
        System.out.println("=========PROCESS "+name.toUpperCase()+" ENDS=========\n");

    }
    public void generateInvoice(){

        System.out.println();
        System.out.println("---INVOICE PROCESS STARTS---");
        calculateCost();
        System.out.println("The price of "+name+" is "+price+"COP");
        System.out.println("The user has a discount");
        applyDiscount();
        calculateTotal();
        System.out.println("Total price to pay is "+total+"COP discount per item included");
        System.out.println("---INVOICE PROCESS ENDS---");
        System.out.println();

    }

    public void calculateCost(){

        this.price = Inventory.retrievePrice(type);

    }
    public void calculateTotal(){
        if(amount != 0){
            this.total = this.price * this.amount;
        }else{
            this.total = this.price;
        }
    }
    public boolean checkStock() {
        return Inventory.retrieveStock(type)-amount >= 0;
    }
    public void clientNotification(){
        System.out.println();
        System.out.println("Notification sent to the user");
    }
    public abstract void shipProduct();
    public abstract void applyDiscount();

}
