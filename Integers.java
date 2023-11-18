import java.util.Scanner;
       public class Integers{

       public static void main(String [] args){
       Scanner input = new Scanner(System.in);

       System.out.println("Enter three integers ");
       int firstNumber = input.nextInt();
       int secondNumber = input.nextInt();
       int thirdNumber = input.nextInt();

       if(firstNumber<secondNumber && firstNumber<thirdNumber){
       System.out.println(firstNumber);
}
       if(secondNumber<firstNumber && secondNumber<thirdNumber){
       System.out.println(secondNumber);
}
       if(thirdNumber<firstNumber && thirdNumber<secondNumber){
       System.out.println(thirdNumber);
}

       if(firstNumber>secondNumber && firstNumber>thirdNumber){
       System.out.println(firstNumber);
}
       if(secondNumber>firstNumber && secondNumber>thirdNumber){
       System.out.println(secondNumber);
}
       if(thirdNumber>firstNumber && thirdNumber>secondNumber){
       System.out.println(thirdNumber);
}







}







}