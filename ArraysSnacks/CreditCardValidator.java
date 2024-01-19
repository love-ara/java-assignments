import java.util.Scanner;
import java.util.*;


	public class CreditCardValidator{


		public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		

		System.out.println("Hello, Kindly Enter Card details to verify");
		String creditCardNumber = input.nextLine();
		

		creditCardNumber = creditCardNumber.replaceAll("\\s+", "").replaceAll("-","");
		System.out.println("");
		int length = creditCardNumber.length();
		
		outputPattern();
		String cardType = checkCreditCardType(creditCardNumber);

		//

		boolean isValid = validCreditCardNumber(creditCardNumber);
		System.out.println("**Credit Card Validity Status: " + (isValid ? "Valid" : "Invalid"));			

		outputPattern();
			
		}

		

		public static String checkCreditCardType(String creditCardNumber){
		
		if(creditCardNumber.length() == 16){
			if(creditCardNumber.startsWith("4")){
			return "Visa Card";
		}else if(creditCardNumber.startsWith("5")){
			return "Mastercard";
		}else if(creditCardNumber.startsWith("6")){
			return "Discover Card";
		}
			}else if(creditCardNumber.length() == 15){
				if(creditCardNumber.startsWith("3")){
			return "American Express Card";
			}
			}
		return "Invalid Card";

		}



		public static boolean validCreditCardNumber(String creditCardNumber){

			int[] digits = new int[creditCardNumber.length()];
			
		for(int index = 0; index < creditCardNumber.length(); index++){
		digits[index] = Character.getNumericValue(creditCardNumber.charAt(index));
				}
			
			for(int index = digits.length-2; index >= 0; index-=2){
				int doubled = digits[index] * 2;
			 	digits[index] = doubled > 9 ? doubled - 9 : doubled;
					}
					int sum = 0;
					for(int digit : digits){
					sum+=digit;
					}

					return sum%10 == 0;


				}

		System.out.println("**Credit Card Type: " + cardType);
		System.out.println("**Credit Card Number: " + creditCardNumber);
		System.out.println("**Credit card Length: " + length);

		public static void outputPattern(){
		int lineLength = 45;
		for(int index = 0; index < lineLength; index++){
			System.out.print("*");
		}
			System.out.println("");
		}

			
	}

