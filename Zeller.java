import java.util.Scanner;

       public class Zeller{
       public static void main(String [] args){


       Scanner input = new Scanner(System.in);

       System.out.println("Enter year: (e.g., 2012) :");
       int year = input.nextInt();
     
       System.out.println("Enter month: 1-12 :");
       int month = input.nextInt();
 
       System.out.println("Enter day of the month: 1-31: ");
       int  days = input.nextInt();

       int century = year / 100;
       int yearOfTheCentury = year%100;
       int monthVariable = 26 * (month + 1) / 10;
       int centuryVariable = yearOfTheCentury + (yearOfTheCentury / 4);
       int centuryCalculated = (century / 4) + (5 * century);
       int dayOfTheWeek = (days + monthVariable + centuryVariable + centuryCalculated)%7;

       if(dayOfTheWeek == 0)System.out.println("Day of the week is Saturday");
       
       if(dayOfTheWeek == 1)System.out.println("Day of the week is Sunday");
       
       if(dayOfTheWeek == 2)System.out.println("Day of the week is Monday");
       
       if(dayOfTheWeek == 3)System.out.println("Day of the week is Tuesday");
       
       if(dayOfTheWeek == 4)System.out.println("Day of the week is Wednesday");
       
       if(dayOfTheWeek == 5)System.out.println("Day of the week is Thursday");
       
       if(dayOfTheWeek == 6)System.out.println("Day of the week is Friday");
       
































}

































}