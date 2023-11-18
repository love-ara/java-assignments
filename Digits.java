import java.util.Scanner;

  public class Digits{
  public static void main(String [] args){

  Scanner input = new Scanner(System.in);
 
  System.out.println("Enter a five digits number");
  int numbers = input.nextInt();
 
  if(numbers <= 99999){
  int firstNumber = numbers / 10000;
  
  int remainder = numbers%10000;

  int secondNumber = remainder / 1000;
  remainder = remainder%1000;

  int thirdNumber = remainder/ 100;
  
  remainder = remainder%100;

  int fourthNumber = remainder / 10;
  remainder = remainder%10;

  int fifthNumber = remainder%10;

System.out.println(firstNumber + " " + secondNumber + " " + thirdNumber + " " + fourthNumber + "  " + fifthNumber);
}else {System.out.println("READ THE INSTRUCTION!!!");

}














}























}