package actividad2.clases;

import java.util.List;

import actividad2.logica.IPaymentMethod;

public class Purchase {
     
    private IPaymentMethod paymenntMethod;

    private List<Product> products;

    public Purchase(IPaymentMethod paymenntMethod, List<Product> products) {
        this.paymenntMethod = paymenntMethod;
        this.products = products;
    }

    public int getTotal(){
        int total=0;
        for (Product product: products){
            total=total+product.getPrice();
        }
        return total;
    }

    public void pay(){
        if(paymenntMethod.validateConnection()){
            paymenntMethod.confirmPayment();
        }
        else{
            System.out.println("No se pudo establecer Conexión");
        }
    }
}
