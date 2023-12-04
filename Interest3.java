
public class Interest3{
	public static void main(String [] args){



	double principal = 1000.0;
	double rate = 0.05;
	int year = 1;
  	
	
      	
	System.out.printf("%s		%s%n", "Year", "Amount on deposit");

	for (year = 1; year<=10; year++){

        double amount = principal * Math.pow (1.0 + rate, year);
          
	 
	System.out.printf("%4d		%,2.2f%n", year, amount);
	}








}










}

