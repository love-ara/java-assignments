import java.util.Scanner;

     public class Bmi{
    
        public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in kilograms: ");
        double weightInKilograms = input.nextDouble();

        System.out.print("Enter height in meters:");
        double heightInMeters = input.nextDouble();

        double bmi = weightInKilograms / (heightInMeters * heightInMeters);
        System.out.println("BMI is " + bmi);

       if(bmi < 18.5)
       System.out.println(" BMI Category: Underweight");
       if(bmi < 25)
       System.out.println("BMI Category: Normal");
       else if(bmi < 30)
       System.out.println("BMI Category: Overweight");
      else
        System.out.println("BMI Category: Obese");











}



}