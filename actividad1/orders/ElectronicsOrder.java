package actividad1.orders;

import actividad1.templateMethod.OrderProcessingTemplate;

public class ElectronicsOrder extends OrderProcessingTemplate {
    @Override
    public boolean checkInventory() {
        return true;
    }

    @Override
    public void shipProduct() {
        System.out.println("SHIPMENT PROCESS STARTS");
        System.out.print("");
        System.out.print("Adding bags on a box");
        System.out.print("Box shipped");
        System.out.println("SHIPMENT PROCESS ENDS");
    }
}
