    import java.util.Scanner;

       public class Game1{

       public static void main (String [] args){
      
       Scanner input = new Scanner(System.in);

       System.out.println("Player 1, enter your name");
       String player1 = input.nextLine();

       System.out.println("Player 2, enter your name");
       String player2 = input.nextLine();

       System.out.printf("%s Please enter a number (0 or 1 or 2)%n", player1);
       int num1 = input.nextInt();
     
       System.out.printf("%s Please enter a number (0 or 1 or 2)%n", player2);
       int num2 = input.nextInt();
        
       if((num1>=0 && num1<=2) && (num2>=0 && num1<=2)) {


       if (num1 == 0 && num2 == 0) System.out.println("draw");
       
       if (num1 == 1 && num2 == 1) System.out.println("draw");
       
       if (num1 == 2 && num2 == 2) System.out.println("draw");

       if (num1 == 0 && num2 == 1)
       System.out.printf("%s won %s!!!", player2, player1);
       
       if (num1 == 0 && num2 == 2)
       System.out.printf("%s won %s!!!", player1, player2);
      
       if (num1 == 1 && num2 == 0)
       System.out.printf("%s won %s!!!", player1, player2);
        
       if (num1 == 1 && num2 == 2)
       System.out.printf("%s won %s!!!", player2, player1);
       
       
       if (num1 == 2 && num2 == 0)
       System.out.printf("%s won %s!!!", player2, player1);
       
       
       if (num1 == 2 && num2 == 1)
       System.out.printf("%s won %s!!!", player1, player2);
       
} else {
       System.out.println("Error!!!, Read the instruction and try again");
}

















}





}