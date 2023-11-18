import java.util.Scanner;

        public class Comparison{

        public static void main (String [] args){


        Scanner tired = new Scanner(System.in);

        System.out.println("Enter an integer");

        int x = tired.nextInt();
       
        int squared = x * x;
        
        if(x<100 && squared<100){
        System.out.printf("%d and %d are less than 100", x, squared);

	} 

       if (x>100 && squared>100){
       System.out.printf("%d and %d are greater than 100", x, squared);
	}

       if (x == 100 && squared == 100){
       System.out.printf("%d and %d are equal to 100", x, squared);

	}

        if (x != 100 && squared != 100){
        System.out.printf("%d and %d are not equal to 100", x, squared);
        }



}
















}