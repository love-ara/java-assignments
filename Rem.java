import java.util.Scanner;
          public class Rem{

          public static void main (String [] args){

          Scanner input = new Scanner(System.in);
           
          System.out.println("Enter two integers");
          int num1 = input.nextInt();
          int num2 = input.nextInt();

          int tripled = num1 * num1 * num1;
          int doubled = num2 * num2;
         

 
          if (tripled%doubled == 0){
          System.out.printf("%d is a multiple of %d", num1, num2);
}
          else { 
          System.out.printf("%d is not a multiple of %d", num1, num2);

}

}

}