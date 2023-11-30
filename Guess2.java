import java.security.SecureRandom;
import java.util.Scanner;

		public class Guess2{
		public static void main (String [] args){

		SecureRandom random = new SecureRandom();
		int number = random.nextInt(1, 10);

		Scanner input = new Scanner(System.in);
		
		System.out.print("Take a guess ");
		int takeGuess = input.nextInt();
		 
		while(takeGuess < 1 || takeGuess > 10){
		System.out.print("Invalid input. Take a guess from 1 - 10 ");
		takeGuess = input.nextInt();
		 }
		if(takeGuess > number){
		System.out.printf("Too high  %nRandom number : %d%nYour guess = %d", number, takeGuess);
		}

                if(takeGuess < number){
		System.out.printf("Too low %nRandom number : %d%nYour guess = %d", number, takeGuess);
		}
                if(takeGuess == number){
		System.out.printf("Correct!!! %nRandom number : %d%nYour guess = %d", number, takeGuess);
		}








}






}