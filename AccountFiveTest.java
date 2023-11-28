import java.util.Scanner;

              public class AccountFiveTest{

               public static void main(String [] args){

               Scanner input = new Scanner(System.in);

               AccountFive accountFive = new AccountFive();

               System.out.println("Welcome to Maverick Bank");

               System.out.println("Enter your id: ");
               int id = input.nextInt();
               accountFive.setId(id);
               accountFive.getId();


               System.out.println("Enter your initial balance: ");
               double balance = input.nextDouble();
               accountFive.setBalance(balance);
               accountFive.getBalance();

               System.out.println("Enter annual interest: ");
               double annualInterestRate = input.nextDouble();
               accountFive.setAnnualInterestRate(annualInterestRate);
               accountFive.getAnnualInterestRate();


               System.out.println("Enter date created: ");
               String date = input.next();
   //            accountFive.setDateCreated(date);
   //            System.out.println(accountFive.getDateCreated());
	
               System.out.println("Would you like to withdraw? yes or no: ");
               String decision = input.next();

               if(decision.equals("yes")){
               System.out.println("Enter withdrawal amount: ");
               double withdrawAmount = input.nextDouble();
               accountFive.withdraw(withdrawAmount);
        //       System.out.println("Withdrawal successful");

               if(withdrawAmount > balance){
               System.out.println("Withdrawal amount exceeds balance");
}
               
               if(withdrawAmount <= balance){
               System.out.println("Withdrawal successful");
               System.out.println("your new balance is " + (balance - withdrawAmount));
}
}

               if(decision.equals("no")){
               System.out.println("Thank you for banking with us ");

}
              
               System.out.println("Would you like to deposit?: ");
               String choice = input.next();
               
               if(choice.equals("yes")){
               System.out.println("Enter deposit amount: ");
               double depositAmount = input.nextDouble();
               accountFive.deposit(depositAmount);
               System.out.println("Deposit Successful");
}


               if(choice.equals("no")){
               System.out.println("Thank you for banking with us ");
}


              System.out.printf("Thank you for banking with us%nYour balance is N%f%nYour monthly interest is %f", accountFive.getBalance(), accountFive.getMonthlyInterest());


          









}

}