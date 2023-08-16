package actividad1.templateMethod;

import actividad1.product.IProduct;

public abstract class OrderProcessingTemplate {

    public String name;

    OrderProcessingTemplate(){}

    final public void processOrder(String product) {

        if (checkInventory()){
            //Podemos poner solo los metodos del desarrollo de la orden pero no es necesario
            //especificar que si esta disponible!
            System.out.println(product+" is available in the inventory");
        }else {
            System.out.println(product+ " is not available in the inventory");
        }
        clientNotification();
        shipProduct();

    }

    public boolean checkInventory2() {

        if()
        return true
    }
    public void clientNotification(){
        System.out.println("Notification sent to user");
    }

    public abstract boolean checkInventory();
    public abstract void shipProduct();

}
