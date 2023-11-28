 import java.util.Scanner;

        public class TriangleArea{

        public static void main(String [] args){

        Scanner input = new Scanner (System.in);

        System.out.println("Enter three points for a triangle: ");
        double 	x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
       
        
       double side1 = y1 - x1;
       double side2 = y2 - x2;
       double side3 = y3 - x3;

       double sum = (side1 + side2 + side3) / 2;
       

       double product = ((sum - side1) * (sum - side2) * (sum - side3));
       System.out.println("poduct is " + product);
        
       
       double area = Math.sqrt(sum * product);

      
      System.out.println("The area of the triangle is " + area);
















}













}