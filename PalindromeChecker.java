import java.util.Scanner;

       public class PalindromeChecker{

       public static void main(String [] args){

       Scanner input = new Scanner(System.in);

       System.out.println("Enter 3 digits");
       int digits = input.nextInt();
       
       if(digits >= 100 && digits <= 999){
       int digit1 = digits/ 100;
       int digit3 = digits%10;

       if(digit1 == digit3){
       System.out.println(digits + " is a palindrome");
}
       else{
       System.out.println(digits + " is not a palindrome");
}



}


}



}