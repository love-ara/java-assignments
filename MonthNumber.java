import java.util.Scanner;
 
       public class MonthNumber{

       public static void main (String [] args){

       Scanner input = new Scanner(System.in);
 
       System.out.println("Enter an integer (between 1-12)");

       int integer = input.nextInt();

       if(integer == 1) System.out.println("January");
       if(integer == 2) System.out.println("February");
       if(integer == 3) System.out.println("March");
       if(integer == 4) System.out.println("April");
       if(integer == 5) System.out.println("May");
       if(integer == 6) System.out.println("June");
       if(integer == 7) System.out.println("July");
       if(integer == 8) System.out.println("August");
       if(integer == 9) System.out.println("September");
       if(integer == 10) System.out.println("October");
       if(integer == 11) System.out.println("November");
       if(integer == 12) System.out.println("December");

 



}


}