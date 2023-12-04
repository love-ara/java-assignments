import java.util.Scanner;

		public class BaseAndPower{


	public static void main(String [] args){

	Scanner input = new Scanner(System.in);

	System.out.println("Enter a number (i.e the base): ");
	int base = input.nextInt();

	System.out.print("Enter a number (i.e the power): ");
	int power = input.nextInt();
        
	int total = 1;

        for(int count = 1 ; count <= power; count++){
	total *= base;
        }
       
        System.out.printf("%d raised to %d = %d ", base, power, total);





}

}