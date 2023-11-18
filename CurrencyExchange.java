import java.util.Scanner;

       public class CurrencyExchange{

       public static void main (String [] args){

       Scanner input = new Scanner(System.in);

       System.out.println("Enter the exchange rate from dollars to RMB");
       float exchangeRate = input.nextFloat();

       System.out.println("Enter 0 to convert dollars to RMB and 1 vise versa");
       int number = input.nextInt();


       if(number == 0){
       System.out. ("Enter the dollar amount");
       double amount = input.nextDouble();

       double dollar = amount * exchangeRate;

       System.out.printf("$%.1f is %.1f yuan", amount, dollar);

}


       if(num == 1){
       System.out.println("Enter the RMB amount");
       double amountTwo = input.nextDouble();
       double yuan = amountTwo/exchangeRate;

       System.out.printf("%.1f yaun is $%.2f", amountTwo, yuan);

}



}












}