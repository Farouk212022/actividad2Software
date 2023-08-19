package actividad1.order;


import actividad1.templateMethod.OrderProcessingTemplate;

public class ClothesOrderProcess extends OrderProcessingTemplate {

    public ClothesOrderProcess(String name, int amount){
        this.type = "Clothes";
        this.name = name;
        this.amount = amount;
    }

    @Override
    public void shipProduct() {
        System.out.println();
        System.out.println("---SHIPMENT PROCESS STARTS---");
        System.out.println("Packing "+name+" in a bag");
        System.out.println("Adding bags on a box");
        System.out.println("Box shipped");
        System.out.println("---SHIPMENT PROCESS ENDS---");
        System.out.println();

    }

    @Override
    public void applyDiscount() {
        double discount = 0.10;
        System.out.println("Applying 10% off season sale");
        price = price - (int) (price*discount);

    }

}
