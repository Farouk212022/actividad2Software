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
        if (nequi.connectionToNequi()) {
            System.out.println("Numero de Celular: " + nequi.getPhoneNumber());
            nequi.confirmUsers();
            return true;
        } else {
            System.out.println("No se logro conectar con Nequi");
            return false;
        }
    }

    @Override
    public boolean confirmPayment() {
        if ("CONFIRMADO".equals(nequi.transferConfirmed())){
            System.out.println("Pago con Nequi realizado");
            nequi.closeTransferToNequi();
            return true;
        }
        else{
            System.out.println("Error en la transferencia");
            return false;
        }
    }

}
