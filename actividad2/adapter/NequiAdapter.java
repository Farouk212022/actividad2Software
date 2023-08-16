package actividad2.adapter;

import actividad2.logica.IPaymentMethod;
import actividad2.paymenntMethods.Nequi;

public class NequiAdapter implements IPaymentMethod {

    private Nequi nequi;

    public NequiAdapter(Nequi nequi) {
        this.nequi = nequi;
    }

    @Override
    public boolean validateConnection() {
        if(nequi.connectionToNequi()){
        System.out.println("Numero de Celular: "+ nequi.getPhoneNumber());
        System.out.println("Conexión con Nuevo Método de pago establecida");
        return true;
        }
        else{
            System.out.println("No se logro conectar con Nequi");
            return false;
        }
    }

    @Override
    public void confirmPayment() {
        System.out.println("Pago con Nuevo Método de Pago realizado");
    }
    
}
