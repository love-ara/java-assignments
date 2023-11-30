import java.util.Scanner;

		public class StudentScore{

		public static void main(String [] args){

	        Scanner input = new Scanner(System.in);

		int highestScore = 0;
		int count = 0;
		String StudentName = " ";
		int numberOfStudents = 0;

		System.out.println("Enter the number of students");
		numberOfStudents = input.nextInt();

              while(count < numberOfStudents){
	      System.out.println("Enter the student's name ");
	      String name = input.next();

	      System.out.println("Enter the student's score ");
	      int score = input.nextInt();

               if(score > highestScore){
               highestScore = score;
	       StudentName = name;
		}
               count++;



}


		System.out.println(StudentName + " has the highest score of " + highestScore);






}
















}