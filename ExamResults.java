import java.util.Scannr;

	public class ExamResults{
		
		public static void main(String [] args){

                Scanner input = new Scanner(System.in);

                int passes = 0;
		int failures = 0;
		int studentCounter = 1;

		while(studentCounter <= 10){
		System.out.print("Enter an exam result");
		int result = input.nextInt();

		if(result == 1){
		   passes = passes + 1;	
		}
else  {
    failures = failures + 1;
	}

       studentCounter = studentCounter + 1;
}
      System.out.print("






}









}