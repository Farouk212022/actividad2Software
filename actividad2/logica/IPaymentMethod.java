package actividad2.logica;

public interface IPaymentMethod {
    
    boolean validateConnection();

    boolean confirmPayment();
}