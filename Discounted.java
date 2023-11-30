import java.util.Scanner;

		public class Discounted{

	           public static void main(String [] args){
  			
		   Scanner input = new Scanner(System.in);

                   System.out.print("Enter an item: ");
		   String item = input.next();

	       	   System.out.printf("Enter the price for %s: ", item);
		   double price = input.nextDouble();
		  
		   while(price <= 0.0){
		   System.out.print("Invalid price. Enter a price: ");
		   price = input.nextDouble();
		   }
		   
		   double discount = (0.1 ) * price;
		   double GrandTotal = price - discount;


               System.out.printf("Item : %s%nPrice : %f%nDiscount : %f%nGrand Total : %f", item, price, discount, GrandTotal); 
	       













}


















}