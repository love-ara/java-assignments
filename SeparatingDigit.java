import java.util.Scanner;


   public class SeparatingDigit{

          public static void main(String [] args){

          Scanner input = new Scanner(System.in);

          System.out.println("Enter a 5digits integer: ");

          int numbers = input.nextInt();

          int numberFive = numbers%10;
          int remainder = numbers/10;
          int numberFour = remainder%10;
          int numberThree = remainder/10;
          int numberTwo= numberThree%10;
          int numberP= numberThree / 10;
          int numberOne = numberP%10;
          int numberD = numberP/10;

          System.out.printf("%d %d %d %d %d", numberFive, numberFour, numberThree, number
P, numberD);









}


















}