import java.util.Scanner;

public class AverageAcceleration{


public static void main (String[] args){


Scanner input = new Scanner (System.in);


System.out.println("Enter starting velocity:");
double a = input.nextDouble();



System.out.println("Enter ending velocity:");
double b = input.nextDouble();



System.out.println("Enter the timespan:");
double t = input.nextDouble();



double c = (b-a)/t;



System.out.println("The average acceleration is" + c);
}



















}