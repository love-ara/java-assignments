import java.util.Scanner;

       public class DisplayHighestScore{
	
	public static void main (String [] args){

	Scanner input = new Scanner(System.in);

	
        int highestScore = 0;
	int counter = 1;
	String highestScorer = " ";

	System.out.println("Enter the number of students ");
	int numberOfStudents = input.nextInt();

	
	while(counter <= numberOfStudents){
	System.out.println("Enter the student's name ");
	String name = input.next();
	
	System.out.println("Enter the student's score ");
	int scores = input.nextInt();

        if(highestScore < scores){
	highestScore = scores;
	highestScorer = name;
}
 

	counter++;
}


	System.out.println("The highest student: " + highestScorer);
	System.out.println("Score: " + highestScore);
	System.out.print("The name of the student with the highest score is " + highestScorer + " with a score of " + highestScore);







 








}














}