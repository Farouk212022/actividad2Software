package actividad2.paymenntMethods;

import actividad2.logica.IPaymentMethod;

public class CreditCard  implements IPaymentMethod{

    private String name;
    private int cardNumber;
    private int cvv;

    public CreditCard(String name, int cardNumber, int cvv) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }
    
    @Override
    public boolean validateConnection() {
        System.out.println("Titular de la cuenta: "+ name);
        System.out.println("Numero de Cuenta: "+ cardNumber);
        System.out.println("Conexión con Tarjeta de Credito establecida");
        return true;
    }

    @Override
    public boolean confirmPayment() {
        System.out.println("Pago con Tarjeta de Credito realizado");
        return true;
    }
    
}
