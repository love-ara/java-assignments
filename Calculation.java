import java.util.Scanner;
       
           public class Calculation{

           public static void main(String [] args){

           Scanner input = new Scanner (System.in);
         
           System.out.println("Enter 3 integers");
           int num1 = input.nextInt();
           int num2 = input.nextInt();
           int num3 = input.nextInt();

           int sum = num1 + num2 + num3;
           int average = sum/3;
           int product = num1*num2*num3;

           System.out.println("The sum is " + sum);
           System.out.println("The average is " + average);
           System.out.println("The product is " + product);

           

           if(num1 < num2 && num1 < num3){
           System.out.println("The smallest number is " + num1 );
}

           if(num2 < num1 && num2 < num3 ){
           System.out.println("The smallest number is " + num2);
}
           
           if(num3 < num1 && num3 < num2){
           System.out.println("The smallest number is " + num3);
} 
           
           if(num1 > num2 && num1 > num3){
           System.out.println("The largest number is " + num1 );
}

           if(num2 > num1 && num2 > num3 ){
           System.out.println("The largest number is " + num2);
}
           
           if(num3 > num1 && num3 > num2){
           System.out.println("The largest number is " + num3);
} 

           
           






}

}