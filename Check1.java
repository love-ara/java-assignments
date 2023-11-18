 import java.util.Scanner;
 
        public class Check1{

        public static void main(String [] args){
      
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");

        int number = input.nextInt();

        if(number%5 == 0 && number%6 ==0){
        System.out.printf("is %d divisible by 5 and 6? true%n", number);
}
        else {System.out.printf("is %d divisible by 5 and 6? false%n", number);
}


        if(number%5 == 0 || number%6 == 0){
        System.out.printf("is %d divisible by 5 or 6? true%n", number);
}
        else { System.out.printf("is %d divisible by 5 or 6? false%n", number);
}

       

        if(number%5 == 0 ^ number%6 == 0){
        System.out.printf("is %d divisible by 5 or 6, but not both?  true%n", number);
}
        else { System.out.printf("is %d divisible by 5 or 6, but not both? false%n", number);
}













}












}