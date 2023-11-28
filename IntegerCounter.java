import java.util.Scanner;

		public class IntegerCounter{

                     public static void main(String [] args){

		     Scanner input = new Scanner(System.in);


 		    System.out.print("Enter an integer, the input ends if it is 0: ");
		    int numbers = input.nextInt();

		    int postiveNumber = 0;
		    int negativeNumber = 0;
		    double total = 0;
		    int counter = 0;

                  
		   while(numbers != 0){                 
                   if(numbers > 0){
		   postiveNumber = postiveNumber + 1;
		   }
		   if(numbers < 0){
 		   negativeNumber = negativeNumber + 1;
                   }
                    total += numbers;
		    counter += 1;
		    System.out.print("Enter an integer, the input ends if it is 0: ");
		    numbers = input.nextInt();

		   }
	            
			 
  		   double average = total / counter;

		   System.out.println("The number of positives is " + postiveNumber);
		   
		   System.out.println("The number of negatives is " + negativeNumber);
		   System.out.println("The total is " + total);
		   System.out.println("The average is " + average);
























}

























}