public class CarTest{
        
    public static void main(String [] args){


       Car car1 = new Car(2000, "2001", "LEXUS");
       Car car2 = new Car(5000, "2013", "Telsa");


     System.out.printf("%s %s %f%n", car1.getModel(), car1.getYear(), car1.getPrice());
     System.out.printf("%s %s %f%n", car2.getModel(), car2.getYear(), car2.getPrice());

     double discount1 = car1.getPrice() - (0.05 * car1.getPrice());
     double discount2 = car2.getPrice() - (0.07 * car2.getPrice());
     System.out.printf("The new price of %s is %f%n", car1.getModel(), discount1); 
     System.out.printf("The new price of %s is %f", car2.getModel(), discount2); 


    

















}

}