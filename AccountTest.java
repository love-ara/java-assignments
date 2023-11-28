import java.util.Scanner;

        public class AccountTest{

          public static void main(String [] args){

          Account account1 = new Account("Fish", 100.00);
	  Account account2 = new Account("Cray", 200.00);

          System.out.printf("%s %.2f%n", account1.getName(), account1.getBalance());
	  System.out.printf("%s %.2f%n", account2.getName(), account2.getBalance());

	  
          Scanner input = new Scanner(System.in);

          System.out.print("Enter withdrawal amount for account1: ");
	  double withdrawAmount = input.nextDouble();
	  account1.withdraw(withdrawAmount);
		
          System.out.print("Enter withdrawal amount for account2: ");
	  double withdrawAmount2 = input.nextDouble();
	  account2.withdraw(withdrawAmount2);
		
          System.out.printf("%s %.2f%n", account1.getName(), account1.getBalance());
	  System.out.printf("%s %.2f%n", account2.getName(), account2.getBalance());
          




             










	} 
  


  
                












}