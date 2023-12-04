import java.util.Scanner;

		public class GeoPoliticalZones{
		
		public static void main(String [] args){
		Scanner input = new Scanner(System.in);

		System.out.print("What state are you from? ");
		String states = input.next();

		if(states == "kebbi" || states == "Sokoto" ||states == "Katsina" || states == "Zamfara" || states == "Kaduna" || states == "Kano");
		System.out.print("NW");

		if(states == "Adamawa" || states == "Yobe" ||states == "Borno" || states == "Bauchi" || states == "Gombe" || states == "Taraba" || states == "Jigawa");
		System.out.print("NE");


		if(states == "Plateau" || states == "Kwara" ||states == "Kogi" || states == "Benue" || states == "Niger" || states == "Nassarawa" || states == "FCT");
		System.out.print("NC");



		if(states == "Lagos" || states == "Ondo" ||states == "Osun" || states == "Oyo" || states == "Ogun" || states == "Ekiti");
		System.out.print("SW");

		if(states == "Abia" || states == "Anambra" ||states == "Ebonyi" || states == "Enugu" || states == "Imo");
		System.out.print("SE");


		if(states == "Bayelsa" || states == "Edo" ||states == "Cross-River" || states == "Delta" || states == "Rivers" || states == "Akwa-Ibom");
		System.out.print("SS");



}









}