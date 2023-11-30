import java.util.Scanner;

	public class PrintPrime{
	
		public static void main(String [] args){

		Scanner input =  new Scanner(System.in);

		System.out.print("Enter a positive integer");
		int number = input.nextInt();

		boolean isPrime = true;
		int count = 2;

		
		while(count <= number / 2){
		 if (number % count == 0){
		    isPrime = false;
		   }
		      count++;
		}  
 		    if (isPrime){
		   System.out.println("The number "+number+" is a prime number");
		  }else{
		   System.out.println("The number "+number+" is not a prime number");
		  }
		
	  	












}




















}