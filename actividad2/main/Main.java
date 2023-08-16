package actividad2.main;

import java.util.Arrays;
import java.util.List;

import actividad2.adapter.NequiAdapter;
import actividad2.clases.Product;
import actividad2.clases.Purchase;
import actividad2.paymenntMethods.CreditCard;
import actividad2.paymenntMethods.Nequi;
import actividad2.paymenntMethods.PayPal;

public class Main{

public static void main(String[] args) {
    List <Product> products = Arrays.asList(new Product("Manzana", 3000),
        new Product("Camisa", 50000),
        new Product("Play 5", 3500000)); 
  
    Purchase purchaseCreditCard = new Purchase(new CreditCard("Usuario de Prueba", 123456789, 123), products);
    System.out.println("\n"+"El total de su compra es: "+purchaseCreditCard.getTotal());
    purchaseCreditCard.pay();

    Purchase purchasePayPal = new Purchase(new PayPal(123456789, "Contrasena"), products);
    System.out.println("\n"+"El total de su compra es: "+purchasePayPal.getTotal());
    purchasePayPal.pay();

    Purchase purchaseNequi = new Purchase(new NequiAdapter(new Nequi("311 123 4567", "123MFATR3")), products);
    System.out.println("\n"+"El total de su compra es: "+purchaseNequi.getTotal());
    purchaseNequi.pay();
    }   
}   