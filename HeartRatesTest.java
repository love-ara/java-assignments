import java.util.Scanner;
     
       public class HeartRatesTest{


         public static void main(String [] args){


        HeartRates heartRates = new HeartRates();
        Scanner input = new Scanner (System.in);

        System.out.println("Enter your first name: ");
        String firstName = input.nextLine();
        heartRates.setFirstName(firstName);
        heartRates.getFirstName();

        System.out.println("Enter your last name: ");
        String lastName = input.nextLine();
        heartRates.setLastName(lastName);
        heartRates.getLastName();

        
        System.out.println("Enter your month of birth: ");
        int monthOfBirth = input.nextInt();
        heartRates.setMonthOfBirth(monthOfBirth);
        heartRates.getMonthOfBirth();

        System.out.println("Enter your day of birth: ");
        int dayOfBirth = input.nextInt();
        heartRates.setDayOfBirth(dayOfBirth);
        heartRates.getDayOfBirth();

        System.out.println("Enter your year of birth: ");
        int yearOfBirth = input.nextInt();
        heartRates.setYearOfBirth(yearOfBirth);
        heartRates.getYearOfBirth();

        System.out.printf("Good day %s%s%nYour Date of birth is %d-%d-%d%n", heartRates.getFirstName(), heartRates.getLastName(), heartRates.getMonthOfBirth(), heartRates.getDayOfBirth(), heartRates.getYearOfBirth());
        
        System.out.printf("Your age is %d%nYour maximum heart rate is %.2f%nYour target heart-rate range is between %.2f to %.2f ",  heartRates.getAge(),  heartRates.getMaximumHeartRate(),  heartRates.getTargetHeartRate1(),  heartRates.getTargetHeartRate2());






  




















}














}