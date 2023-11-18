import java.util.Scanner;
            public class SmallLarge{
            
            public static void main (String [] args){

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter 5 integers ");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int num3 = scanner.nextInt();
            int num4 = scanner.nextInt();
            int num5 = scanner.nextInt();
             

            if (num1<num2 && num1<num3 && num1<num4 && num1<num5) {
            System.out.printf("%d is the smallest number", num1);
}

            if (num2<num1 && num2<num3 && num2<num4 && num2<num5) {
            System.out.printf("%d is the smallest number%n", num2);
}

            if (num3<num1 && num3<num2 && num3<num4 && num3<num5) {
            System.out.printf("%d is the smallest number%n", num3);
}

            if (num4<num1 && num4<num2 && num4<num3 && num4<num5) {
            System.out.printf("%d is the smallest number%n", num4);
}

            if (num5<num1 && num5<num2 && num5<num3 && num5<num4)  {
            System.out.printf("%dis the smallest number%n", num5);
}


       if (num1>num2 && num1>num3 && num1>num4 && num1>num5) {
            System.out.printf("%d is the largest number", num1);
}

            if (num2>num1 && num2>num3 && num2>num4 && num2>num5) {
            System.out.printf("%d is the largest number", num2);
}

            if (num3>num1 && num3>num2 && num3>num4 && num3>num5) {
            System.out.printf("%d is the largest number", num3);
}

            if (num4>num1 && num4>num2 && num4>num3 && num4>num5) {
            System.out.printf("%d is the largest number", num4);
}

            if (num5>num1 && num5>num2 && num5>num3 && num5>num4)  {
            System.out.printf("%d is the largest number", num5);
}



           








}


}