    import java.util.Scanner;
  
    public class Conversion2{
    
    public static void main (String [] args){

    Scanner input = new Scanner(System.in);
  
   
    
    System.out.println("Enter a celsius degree");
 
    double deg = input.nextDouble();
   
    double fahrenheit = ( (9.0 / 5) * deg + 32);
    
    System.out.printf(" %.1f celsius is %.1f Fahrenheit", deg, fahrenheit);
}


}