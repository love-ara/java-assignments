import java.util.Scanner;

public class FutureInvestment {

public static void main (String [] args){

Scanner input = new Scanner (System.in);

System.out.println("Enter investment amount: ");
double a = input.nextDouble();

System.out.println("Enter annual interest rate in percentage e.g 5%: ");
double b = input.nextDouble();
double b2 = b/1200;


System.out.println("Enter number of years: ");
double c = input.nextDouble();
double c2 = c*12;

double d = a * Math.pow((1 + b2), c2);



System.out.println("Accumulated value is :" +d);



}




















}