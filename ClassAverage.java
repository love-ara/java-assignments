import java.util.Scanner;

	public class ClassAverage{

		public static void main(String [] args){

		Scanner input = new Scanner(System.in);

		int total = 0;
		int gradeCounter = 1;
	
		while (gradeCounter <= 10){
		System.out.print("Enter the grade ");
		int grade = input.nextInt(); 
		total = total + grade;
		gradeCounter = gradeCounter + 1;
		}

		float average = total / 10;
		System.out.println("Total = " + total);
		System.out.print("Class average = " + average);

























}















}