import java.util.*;
import java.text.SimpleDateFormat;
//import java.util.Date;

	

	public class CheckOutApp{

		public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.println("SEMICOLON STORES ");
		System.out.println("MAIN BRANCH");
		System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
		System.out.println("TEL: 03293828343");
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss a");
		Date date = new Date();
		System.out.println("Date : "+formatter.format(date));
		System.out.println("Cashier: Araola");

		System.out.print("What is your name please? ");
		String customerName = input.nextLine();

		char choice = '\0';
		double totalPrice = 0.0;
		double subTotal = 0.0;
		
		List<Product> product = new ArrayList<Product>();


		do{
			System.out.println("What are you buying? ");
			String name = input.nextLine();

			System.out.println("How many pieces?");
			int qty = input.nextInt();

			System.out.println("How much per unit? ");
			double price = input.nextDouble();

			 totalPrice = price * qty;
		
			product.add(new Product(name, qty, price, totalPrice));

			System.out.print("Want to add more items? (y or n): ");
			 choice = input.next().charAt(0);
				input.nextLine();

			}
			
			while(choice == 'y' || choice == 'Y');
			
			Product.displayFormat();
			for(Product p : product){
				p.display();
			}
			

	System.out.printf("-------------------------------------------------------------------------------------------------%n");
			subTotal = subTotal + totalPrice;
			System.out.println("\n\t\t\t\t\t\t Sub Total:		" +         subTotal);

			double discount = 0.08 * subTotal;
			System.out.println("\n\t\t\t\t\t\t  Discount:		" +         discount);
			
			double vat = 0.175 * subTotal;
			System.out.printf("%n\t\t\t\t\t\t VAT @ 17.50 %% :  	 %.2f%n",         vat);
			
	System.out.printf("-------------------------------------------------------------------------------------------------%n");
	System.out.printf("-------------------------------------------------------------------------------------------------%n");
			double billTotal = subTotal + discount + vat;
			System.out.println("\n\t\t\t\t\t\t  Bill Total:  " +         billTotal);
	System.out.printf("-------------------------------------------------------------------------------------------------%n");
	System.out.printf("-------------------------------------------------------------------------------------------------%n");

			System.out.print("\t\t\tTHIS IS NOT A RECIEPT KINDLY PAY N" + billTotal);
	System.out.printf("%n-------------------------------------------------------------------------------------------------%n");
	System.out.printf("-------------------------------------------------------------------------------------------------%n");
			


			System.out.print ("\n\n\nHow much cash are you paying with?: ");
			double amount = input.nextDouble();
		

		System.out.println("\n\n\n\n");
		System.out.println("SEMICOLON STORES ");
		System.out.println("MAIN BRANCH");
		System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
		System.out.println("TEL: 03293828343");
		System.out.println("Date : "+formatter.format(date));
		System.out.println("Cashier: Araola");
		System.out.println("Customer Name: " + customerName);
//System.out.printf("-------------------------------------------------------------------------------------------------%n");
	//System.out.printf("-------------------------------------------------------------------------------------------------%n");
	//System.out.println("\n\t\t\tITEM \t\tQTY \t\tPRICE \t\tTOTAL(NGN)  ");
	//System.out.printf("--------------------------------------------------------------------------------------------%n");
	Product.displayFormat();
	 
			
		//for(Product p : product);

	



	System.out.printf("-------------------------------------------------------------------------------------------------%n");
		
			System.out.println("\n\t\t\t\t\t\t Sub Total:		" +         subTotal);

		
			System.out.println("\n\t\t\t\t\t\t  Discount:		" +         discount);
			
		
			System.out.printf("\n\t\t\t\t\t\t VAT @ 17.50 %% :  	 %.2f%n",         vat);
			
	System.out.printf("-------------------------------------------------------------------------------------------------%n");
	System.out.printf("-------------------------------------------------------------------------------------------------%n");
			billTotal = subTotal + discount + vat;
			System.out.println("\n\t\t\t\t\t\t  Bill Total:  " +         billTotal);
			System.out.println("\n\t\t\t\t\t\t Amount Paid: " + amount); 
			double balance = amount - billTotal;
			System.out.println("\n\t\t\t\t\t\t	Change: " + balance); 
	System.out.printf("-------------------------------------------------------------------------------------------------%n");
	System.out.printf("-------------------------------------------------------------------------------------------------%n");

			System.out.print("\t\t\tTHANK YOU FOR YOUR PATRONAGE");
	System.out.printf("%n-------------------------------------------------------------------------------------------------%n");
	System.out.printf("-------------------------------------------------------------------------------------------------%n");


}

}

	 class Product {

		private String name;
		private int qty;
		private double price;
		private double totalPrice;


	public Product(String productName, int quantity, double price, double totalPrice){
		name = productName;
		qty = quantity;
		this.price = price;
		this.totalPrice = totalPrice;

		}

	public String getName(){
		return name;
		}

	public int getQty(){
		return qty; 

		}
	
	public double getPrice(){
		return price;
		}
	
	public double getTotalPrice(){
		return totalPrice;
		}
		
		public static void displayFormat(){
	System.out.printf("----------------------------------------------------------------------------------------%n");

	System.out.println("\n\t\tITEM \t\tQTY \t\tPRICE \t\tTOTAL(NGN)  ");
	System.out.printf("--------------------------------------------------------------------------------------%n");
	
		}

		public void display(){
			System.out.printf("%n\t\t%s	\t%d	\t%.2f		\t%.2f%n", name, qty, price, totalPrice);
		}




		

}







































