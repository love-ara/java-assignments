public class Car{
     private double price;
     private String year;
     private String model;
    

     public Car(double price, String year, String model){
 

      if(price > 0.0){
      this.price = price;
      }
      this.year = year;
      this.model = model;
     }
    
    public void setPrice(double price){
      this.price = price;
      }
   
    public double getPrice(){
        return price;
	}
     public void setYear(String year){
	this.year = year;
	}
     public String getYear(){
          return year;
        }

      public void setModel(String model){
          this.model = model;
        }
      public String getModel(){
         return model;
}


 
        








     }
       










































