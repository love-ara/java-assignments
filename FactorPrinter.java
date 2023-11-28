import java.util.Scanner;

		public class FactorPrinter {
    
		      public static void main(String [] args){
       
	              Scanner input = new Scanner(System.in);
      		
	             System.out.print("Enter an integer: ");
                     int number = input.nextInt();

                     System.out.print( "The factors " +  number + " are " );


       
	             for (int factor = 1; factor <= number; factor++) {
                     if(number%factor == 0) {
                     System.out.print(factor + " ");
                     }
                      }

	            
















}
}