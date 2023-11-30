import java.util.Scanner;

		public class AbsoluteValue{
			public static void main(String [] args){

			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter any whole number ");
			int number = input.nextInt();

                        int absolute = 1;
			if(number < 0){
			absolute = (number) * -1;
			}else {
				absolute =  number * 1;
			}
			System.out.print("The absolute value of " + number + " is " + absolute);



}











}