import java.util.Scanner;

     public class PetrolPurchaseTest{
      public static void main(String [] args){

      PetrolPurchase petrolPurchase = new PetrolPurchase("Obalende", "Diesel", 1000.00, 5);

      Scanner input = new Scanner(System.in);
    
    
     System.out.println("How many litres please? ");
     int quantity = input.nextInt();
     petrolPurchase.setQuantity(quantity);
     petrolPurchase.getQuantity();

  

     
     System.out.printf("    NET PURCHASE : N%.2f%n ", petrolPurchase.getPurchaseAmount());
     System.out.printf("Discount applied : %.2f Percent", petrolPurchase.getDiscount());




























}



}