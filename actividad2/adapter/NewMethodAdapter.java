package actividad2.adapter;

import actividad2.logica.IPaymentMethod;
import actividad2.paymenntMethods.NewMethod;

public class NewMethodAdapter implements IPaymentMethod {

    private NewMethod newMethod;

    public NewMethodAdapter(NewMethod newMethod) {
        this.newMethod = newMethod;
    }

    @Override
    public boolean validateConnection() {
        System.out.println("Nombre de la Cuenta: "+ newMethod.getName());
        System.out.println("Numero de Cuenta: "+ newMethod.getAccountNumber());
        System.out.println("Conexión con Nuevo Método de pago establecida");
        return true;
    }

    @Override
    public void confirmPayment() {
        System.out.println("Pago con Nuevo Método de Pago realizado");
    }
    
}
