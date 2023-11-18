 import java.util.Scanner;
   
      public class Values1{

      public static void main (String [] args){
    
      Scanner input = new Scanner(System.in);
      
      int countPositive = 0;
      int countNegative = 0;
      int countZero = 0;
      int numberCounter = 1;
  
      while (numberCounter <= 5 ){
      System.out.println("Enter a number");
      int num = input.nextInt();

      if (num>0){
      countPositive = countPositive + 1;
      numberCounter  = numberCounter + 1;
}
      
      if (num<0){
      countNegative = countNegative + 1;
      numberCounter  = numberCounter + 1;
}

      if (num == 0){
      countZero = countZero + 1;
      numberCounter  = numberCounter + 1;
}

}

      System.out.printf("There are %d positive numbers, %d negative numbers, %d zero numbers", countPositive, countNegative, countZero);
      



}

}