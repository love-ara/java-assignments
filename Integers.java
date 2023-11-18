import java.util.Scanner;
       public class Integers{

       public static void main(String [] args){
       Scanner input = new Scanner(System.in);

       System.out.println("Enter three integers ");
       int firstNumber = input.nextInt();
       int secondNumber = input.nextInt();
       int thirdNumber = input.nextInt();

       if(firstNumber>secondNumber &&  secondNumber>thirdNumber)
System.out.printf("%d %d %d", thirdNumber, secondNumber, firstNumber);
 
       if(secondNumber>firstNumber && firstNumber>thirdNumber)
System.out.printf("%d %d %d",  thirdNumber, firstNumber, secondNumber);
    
        if(thirdNumber>firstNumber && firstNumber>secondNumber)
System.out.printf("%d %d %d", secondNumber, firstNumber, thirdNumber);

        if(firstNumber>thirdNumber && thirdNumber>secondNumber)
System.out.printf("%d %d %d", firstNumber, thirdNumber, secondNumber);

     if(secondNumber>thirdNumber && thirdNumber>firstNumber)
System.out.printf("%d %d %d", firstNumber, thirdNumber, secondNumber);

     if(thirdNumber>secondNumber && secondNumber>firstNumber)
System.out.printf("%d %d %d", secondNumber, thirdNumber, firstNumber);



     















}







}