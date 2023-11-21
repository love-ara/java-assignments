import java.util.Scanner;

         public class EnegryCalculator{
         public static void main(String [] args){


          Scanner input = new Scanner(System.in);

          System.out.println("Enter the amount of water in kilograms: ");
          double waterQuantity = input.nextFloat();

          System.out.println("Enter the initial temperature: ");
          float initialTemperature = input.nextFloat();

          System.out.println("Enter the final temperature: ");
          float finalTemperature = input.nextFloat();


         double energy = waterQuantity * (finalTemperature - initialTemperature) * 4184;

          System.out.printf("The energy needed is %f", energy);













}





















}