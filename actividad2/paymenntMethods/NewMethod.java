package actividad2.paymenntMethods;

public class NewMethod {
    
    private String name;
    private int accountNumber;
    private String code;

    public NewMethod(String name, int accountNumber, String code) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.code = code;
    }

     public String getName() {
        return this.name;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public String getCode() {
        return this.code;
    }

}
