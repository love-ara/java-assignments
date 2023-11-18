 import java.util.Scanner;

        public class DaysOfMonth{

        public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        
        System.out.println("Enter the month(1-12)");
        int month = input.nextInt();
        
        System.out.println("Enter the year");
        int year = input.nextInt();
       
        if(month<1 || month>12){
        System.out.println("Error!!!");
} else{    
        
        if(month == 1)
	System.out.printf("January %d has 31 days", year);        
        if(month == 2){
        if(year%4 == 0)
	System.out.printf("February %d has 29 days", year); 	
	if(year%4 != 0)
	System.out.printf("February %d has 28 days", year); 
        }
        if(month == 3)
	System.out.printf("March %d has 31 days", year);        
        if(month == 4)
	System.out.printf("April %d has 30 days", year);
        if(month == 5)
	System.out.printf("May %d has 31 days", year);        
        if(month == 6)
	System.out.printf("June %d has 30 days", year); 
        if(month == 7)
	System.out.printf("July %d has 31 days", year);        
        if(month == 8)
	System.out.printf("August %d has 31 days", year);
        if(month == 9)
	System.out.printf("September %d has 30 days", year);        
        if(month == 10)
	System.out.printf("October %d has 31 days", year); 
        if(month == 11)
	System.out.printf("November %d has 30 days", year);        
        if(month == 12)
	System.out.printf("December %d has 31 days", year);
        
        
}
       

        




}




 











}