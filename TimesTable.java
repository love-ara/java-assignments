import java.util.Scanner;

		public class TimesTable{
		
	             public static void main(String [] args){

			Scanner input = new Scanner(System.in);

			System.out.print("Enter a number from 1-10: ");
			int number = input.nextInt();
			
			int count = 1;
			
			if(number < 1 || number > 10){
			System.out.print("Invalid number");
			}else { while(count <= 12){
			int timeTable = number * count;
			System.out.printf("%d * %d = %d%n", number, count, timeTable);
			count++;
			}
			}



}


}		