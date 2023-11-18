import java.util.Scanner;
     

         public class Interest{
      public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);
     
    System.out.println("Enter balance and interest rate:");
      int balance = scanner.nextInt();
      double interestRate = scanner.nextDouble();


     double interest = balance *(interestRate/1200);

System.out.println("The interest is " +interest);














}





}