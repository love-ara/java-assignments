public class Car{

     private String model;
     private String year;
     private double price;

     
     
     public Car(double price){
        if (price > 0.0){
        this.price = price;
     }
}

      
     public void amount(double setPrice) {
         if(setPrice > 0.0){
         price = price + setPrice;
     }

}
     public double getPrice() {
           return price;
     }

      



}