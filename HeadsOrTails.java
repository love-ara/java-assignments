import java.util.*;

       public class HeadsOrTails{
       public static void main(String [] args){
 
       Scanner input = new Scanner(System.in);

       System.out.print("Take a guess: Head or Tail ");
       String takeAGuess = input.next();
       int head = 0;
       if(takeAGuess.equals("head")){
       head = 1;
}
      

       Random random = new Random();
       int generate = random.nextInt(1);
       System.out.println(generate);
       
       if(head == generate){
       System.out.print("The guess is correct");
} else {System.out.print("The guess is incorrect");
}
















}


}






