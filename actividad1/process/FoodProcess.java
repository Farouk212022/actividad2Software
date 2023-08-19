package actividad1.process;

import actividad1.inventory.Inventory;
import actividad1.templateMethod.OrderProcessingTemplate;

public class FoodProcess extends OrderProcessingTemplate{

    public FoodProcess(Inventory inventory) {
        super(inventory);
    }

    @Override
    public void shipProduct() {

        System.out.println();
        System.out.println("---SHIPMENT PROCESS STARTS---");
        System.out.println("A driver is waiting for your "+order.getName());
        System.out.println("The "+order.getName()+" is ready for pickup");
        System.out.println("The driver is on your way with the "+order.getName());
        System.out.println("---SHIPMENT PROCESS ENDS---");
        System.out.println();

    }

    @Override
    public void applyDiscount() {
        double discount = 0.05;
        System.out.println("Applying 5% anniversary discount for loyalty to the brand");
        order.setPrice(order.getPrice() - (int) (order.getPrice()*discount));

    }
}
