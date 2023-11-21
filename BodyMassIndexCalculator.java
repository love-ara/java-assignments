import java.util.Scanner;

       public class BodyMassIndexCalculator{
       public static void main(String [] args){

       Scanner input = new Scanner(System.in);

       System.out.print("Enter weight in pounds: ");
       double weight = input.nextDouble();
       double weightInKilograms = weight * 0.45359237;

       System.out.print("Enter height in inches: ");
       double height = input.nextDouble();
       double heightInMeters = height * 0.0254;

       double bmi = weightInKilograms / heightInMeters;

       System.out.printf("BMI is %f", bmi);



















}

















}