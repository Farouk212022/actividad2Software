package actividad2.paymenntMethods;

import actividad2.logica.IPaymentMethod;

public class PayPal implements IPaymentMethod{

    private int accountNumber;

    private String password;
    

    public PayPal(int accountNumber, String password) {
        this.accountNumber = accountNumber;
        this.password = password;
    }

    @Override
    public boolean validateConnection() {
        System.out.println("Cuenta:"+ accountNumber);
        System.out.println("Conexión con PayPal establecida");
        return true;
    }

    @Override
    public void confirmPayment() {
        System.out.println("Pago con PayPal realizado");
    }
    
}