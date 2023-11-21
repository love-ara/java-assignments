import java.util.Scanner;

      public class PyramidOfGiza{

      public static void main(String [] args){

      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter an estimated number of stones used: ");
      int estimatedNumberOfStones = input.nextInt();
     
      System.out.println("Enter an average weight of each stone: ");
      float averageWeight = input.nextFloat();
  
      System.out.println("Enter numbers of years taken to build the pyramid (assuming a year comprises 365 days): ");
      int estimatedYears = input.nextInt();
 
      float totalWeight = estimatedNumberOfStones * averageWeight;
      float weightPerYear = totalWeight / estimatedYears;
      float weightPerDay = weightPerYear / 365;
      float weightPerHour = weightPerDay / 24;
      double weightPerMinute = weightPerHour / 60;

      System.out.printf("The pyramid was built by %f weight each year%n", weightPerYear);
      System.out.printf("The pyramid was built by %f weight per hour%n", weightPerHour);
      System.out.printf("The pyramid was built by %f weight per minute%n", weightPerMinute);









}



















}