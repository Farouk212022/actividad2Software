package actividad1.order;

import actividad1.templateMethod.OrderProcessingTemplate;

public class ElectronicsOrder extends OrderProcessingTemplate {

    public ElectronicsOrder(String name, int amount){

        this.type = "Electronics";
        this.name = name;
        this.amount = amount;

    }

    @Override
    public void shipProduct() {

        System.out.println();
        System.out.println("---SHIPMENT PROCESS STARTS---");
        System.out.println("Creating unique identifier for the "+name);
        System.out.println("Adding stickers about care for the box");
        System.out.println("Box shipped");
        System.out.println("---SHIPMENT PROCESS ENDS---");
        System.out.println();
    }

    @Override
    public void applyDiscount() {
        double discount = 0.20;
        System.out.println("Applying 20% student discount");
        price = price - (int) (price*discount);


    }
}
