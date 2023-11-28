import java.util.Scanner;

      public class HealthProfileTest{

           public static void main(String [] args){


       HealthProfile healthProfile = new HealthProfile();
       Scanner input = new Scanner(System.in);

        System.out.println("Please enter your first name: ");
	String firstName = input.nextLine();
	healthProfile.setFirstName(firstName);
	healthProfile.getFirstName();

        System.out.println("Please enter your last name: ");
	String lastName = input.nextLine();
	healthProfile.setLastName(lastName);
	healthProfile.getLastName();
        
        System.out.println("Please enter your gender: ");
	String gender = input.nextLine();
	healthProfile.setGender(gender);
	healthProfile.getGender();

        System.out.println("Enter your month of birth: ");
        int monthOfBirth = input.nextInt();
        healthProfile.setMonthOfBirth(monthOfBirth);
        healthProfile.getMonthOfBirth();

        System.out.println("Enter your day of birth: ");
        int dayOfBirth = input.nextInt();
        healthProfile.setDayOfBirth(dayOfBirth);
        healthProfile.getDayOfBirth();

        System.out.println("Enter your year of birth: ");
        int yearOfBirth = input.nextInt();
        healthProfile.setYearOfBirth(yearOfBirth);
        healthProfile.getYearOfBirth();

        System.out.print("Enter your weight in pounds: ");
	double weightInPounds = input.nextDouble();
	healthProfile.setWeightInPounds(weightInPounds);
	healthProfile.getWeightInPounds();

	
        System.out.print("Enter your height in inches: ");
	double heightInInches = input.nextDouble();
	healthProfile.setHeightInInches(heightInInches);
	healthProfile.getHeightInInches();


        System.out.printf("Goodday %s %s,%n%s%nDOB is %d-%d-%d%n", healthProfile.getFirstName(), healthProfile.getLastName(),  healthProfile.getGender(), healthProfile.getMonthOfBirth(), healthProfile.getDayOfBirth(), healthProfile.getYearOfBirth());

  	System.out.printf("Age: %d%nBMI: %.2f%nMaximum heart rate:  %.2f%nTarget heart-rate range between %.2f to %.2f ",  healthProfile.getAge(), healthProfile.getBmi(), healthProfile.getMaximumHeartRate(),  healthProfile.getTargetHeartRate1(),  healthProfile.getTargetHeartRate2());



  

  























}

}