import java.util.Scanner;

	public class PrintPrime{
	
		public static void main(String [] args){

		Scanner input =  new Scanner(System.in);

		System.out.print("Enter a positive integer");
		int number = input.nextInt();

		boolean isPrime = true;

		if (number > -1){
		for (int i = 2; i <= number / 2; i++){
		 
		  if (number % i == 0){
		    isPrime = false;
		   }
		}  

		if (isPrime){
		   System.out.println("The number "+number+" is a prime number");
		  }else{
		   System.out.println("The number "+number+" is not a prime number");
		  }
		}
	  	












}




















}