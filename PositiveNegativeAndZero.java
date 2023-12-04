import java.util.Scanner;

		public class PositiveNegativeAndZero{

	public static void main(String [] args){

	Scanner input = new Scanner(System.in);

	int positives = 0;
	int negatives = 0;
	int zeros = 0;

        
	//System.out.println("Enter any number except -1(Enter -1 to terminate) :");
	//int number = input.nextInt();

	while(true){
	System.out.print("Enter any number :");
	 int number = input.nextInt();

	  if(number > 0){
	  positives += 1;
	 }
	  else if(number < 0){
	   negatives += 1;
	  } else {
	 zeros ++;
	}
	if(number == 0){
	break;
	}

	System.out.printf("Number of positive = %d%nNumber of negative = %d%nNumber of zeros = %d", positives, negatives, zeros);



}

}