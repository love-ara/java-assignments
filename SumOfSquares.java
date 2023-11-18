import java.util.Scanner;

           public class SumOfSquares{
           public static void main (String [] args){
           
           Scanner scanner = new Scanner(System.in);
   
           System.out.println("Enter x and y");
           int x = scanner.nextInt();
           int y = scanner.nextInt();



           int a = x * x;
           int b = y * y;
           int sumOfSquares = (a + b);
           int differencesOfSquares = (a - b);

         System.out.printf("The sum of squares is %d%n", sumOfSquares);
         System.out.printf("The differences of squares is %d", differencesOfSquares);








}

}