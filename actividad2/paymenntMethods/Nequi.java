package actividad2.paymenntMethods;

public class Nequi {
    
    private String phoneNumber;
    private String code;

    public Nequi(String phoneNumber, String code) {
        this.phoneNumber = phoneNumber;
        this.code = code;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getCode() {
        return this.code;
    }

    public boolean connectionToNequi(){
        System.out.println("Se ha logrado conectar con Nequi");
        return true;
    }

    public boolean initTransferProcces(){
        System.out.println("Iniciando Transferencia");
        return true;
    }

    public boolean transferConfirmed(){
        System.out.println("Transferencia Confirmada");
        return true;
    }

    public boolean closeConnectionToNequi(){
        System.out.println("Conexión con Nequi cerrada");
        return true;
    }
}
