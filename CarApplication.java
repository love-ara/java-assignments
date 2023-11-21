import java.util.Scanner;

 public class carApplication{
       
     public static void main(String [] args){
       
       Car car1 = new Car(690.00);
       Car car2 = new Car(750.00);

    System.out.printf("price : %f%n%n", 
          car1.getPrice()); 
    System.out.printf("price: %f%n%n", 
          car2.getPrice()); 

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a price for car1: ");
     double priceOne = input.nextDouble();
    System.out.printf("%nadding %.2f to car1 price%n%n", priceOne);
    car1.amount(priceOne);


     System.out.print("Enter a price for car2: ");
     double priceTwo = input.nextDouble();
     System.out.printf("%nadding %.2f to car2 price%n%n", priceTwo);
     car2.amount(priceTwo);




    System.out.printf("price: %.2f%n", car1.getPrice());
    System.out.printf("price: %.2f%n", car2.getPrice());




}















}
       