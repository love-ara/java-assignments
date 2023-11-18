import java.util.Scanner;
       public class PerimeterOfTriangle{
       public static void main(String [] args){

       Scanner input = new Scanner(System.in);

       System.out.println("Enter the three edges of a triangle");
       int edge1 = input.nextInt();
       int edge2 = input.nextInt();
       int edge3 = input.nextInt();


      int perimeter = edge1 + edge2 + edge3;
      int sum1 = edge1 + edge2;
      int sum2 = edge1 + edge3;
      int sum3 = edge2 + edge3;
 
      if(sum1>edge3 && sum2>edge2 && sum3>edge1)System.out.print(perimeter);

else { System.out.print("INVALID");
}



}
























}