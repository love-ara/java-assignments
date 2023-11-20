import java.util.Scanner;

       public class Lottery{

       public static void main(String [] args){

       int lottery = (int)(Math.random() * 100);

       Scanner input = new Scanner(System.in);
       System.out.print("Enter three digits number ");
       int entry = input.nextInt();

       int lotteryNumber1 = lottery / 100;
       int remainder = lottery%100;
       int lotteryNumber2 =  remainder / 10;
       int lotteryNumber3 = remainder%10;

       int entryOne = entry /100;
       int entryRemainder = entry%100;
       int entryTwo = entryRemainder / 10;
       int entryThree = entryRemainder%10;

       System.out.println("The lottery number is " + lottery);

       if(entry == lottery){
System.out.println("Exact order: your reward is $10,000");
}
       else if(entryOne == lotteryNumber1 && entryTwo == lotteryNumber2 && entryThree == lotteryNumber3){
System.out.println("All digit match lottery number:your reward is $3,000");
}
       else if(entryOne == lotteryNumber1 || entryOne == lotteryNumber2 || entryOne == lotteryNumber3 || entryTwo == lotteryNumber1 || entryTwo == lotteryNumber2 || entryThree == lotteryNumber3 || entryThree == lotteryNumber1 || entryTwo == lotteryNumber2 || entryThree == lotteryNumber3 ){
System.out.println("One digit is matched: your reward is $1,000");
}

   else 
       System.out.println("No match, try again");

}








}