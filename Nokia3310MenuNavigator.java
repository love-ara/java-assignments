import java.util.Scanner;

	public class Nokia3310MenuNavigator{

	public static void main(String [] args){

	Scanner press = new Scanner(System.in);


	System.out.print("Press any number to go the main menu: ");
	int menu = press.nextInt();
	System.out.println(" ");


        System.out.println("1.  Phone book \n2.  Messages \n3.  Chat \n4.  Call Register \n5.  Tones \n6.  Settings \n7.  Call Divert \n8.  Games \n9.  Calculator \n10. Remainders \n11. Clock \n12. Profiles \n13. SIM services");
	
	System.out.println(" ");

	System.out.print("press a number (1-13): ");
        int number = press.nextInt();
	
	switch(number){
	case 1:
	System.out.print("Phone book\n");
	System.out.println("1.  Search \n2.  Service Nos \n3.  Add Name \n4.  Erase \n5.   Edit \n6.  Assign Tone \n7.  Send B'Card \n8.  Options \n9.  Speed Dials \n10. Voice Tags");
       System.out.print("press a number from 1-10 to select: ");
	int phoneBook = press.nextInt();
	     switch(phoneBook){
		case 1: 
		System.out.print("Search");
		break;

		case 2: 
		System.out.print("Service Nos");
		break;

		case 3:
		System.out.print("Add Name");
		break;
	
		case 4:
		System.out.print("Erase");
		break;
		
		case 5:
		System.out.print("Edit");
		break;

		case 6:
		System.out.print("Assign Tone");
		break;

		case 7:
		System.out.print("Send B'Card");
		break;

		case 8:
		System.out.println("1.Type of view \n2.Memory Status");
		break;

		case 9:
		System.out.print("Speed Dials");
		break;

		case 10:
		System.out.print("Voice tag");
		break;
}   		break;

	
	case 2:
	System.out.println("Messages");
	System.out.println(" ");
	System.out.println("1.Write messages \n2.  Inbox \n3.  Outbox \n4.  Picture messages \n5.  Templates \n6.  Smileys \n7.  Message settings \n8.  Info service \n9.  Voice mailbox number \n10. Service command editor"); 
	System.out.println(" ");
	System.out.print("Enter a number to select (1-10): ");
	int messageOption = press.nextInt();

             switch(messageOption){
		case 1: 
		System.out.println("Write messages");
		break;

		case 2: 
		System.out.print("Inbox");
		break;

		case 3:
		System.out.println("Outbox");
		break;
	
		case 4:
		System.out.println("Picture messages");
		break;
		
		case 5:
		System.out.println("Templates");
		break;

		case 6:
		System.out.println("Smileys");
		break;

		case 7:
		System.out.println(" Message settings");
		System.out.println("1. Set 1 \n2. Common");
		System.out.println("Select an option (1 or 2): ");
		int messageSettingsOption = press.nextInt();
			switch(messageSettingsOption){
       				case 1: 
				System.out.println("1. Message centre number \n2. Message sent as \n3. Message settings");
				System.out.println("Select an option (1 or 2 or 3): ");
				int set = press.nextInt();
					switch(set){
					case 1:
					System.out.print("Message centre number");
					break;
					case 2:
					System.out.print("Message sent as");
					break;	
					case 3:
					System.out.print("Message settings");
					break;
					}break;
				
				case 2:
				System.out.println("1. Delivery reports \n2. Reply via same centre \n3. Character support");
				System.out.print("Select an option (1 or 2 or 3): ");
				int common = press.nextInt();
					switch(common){
					case 1:
					System.out.print("Delivery reports");
					break;
					case 2:
					System.out.print("Reply via same centre ");
					break;	
					case 3:
					System.out.print("Character support");
					break;
					}break;
		}
		break;

		case 8:
		System.out.println("Info service");
		break;

		case 9:
		System.out.println(" Voice mailbox number");
		break;

		case 10:
		System.out.println("Service command editor");
		break;
	}       break;

	
	case 3:
	System.out.println("Chat");
	break;

	case 4:
	System.out.println("Call register");
	System.out.println(" ");
	System.out.println("1. Missed calls \n2. Received calls \n3. Dialled numbers \n4. Erase recent call lists \n5. Show call duration \n6. Show call costs \n7. Call cost settings \n8. Prepaid credit");
	System.out.println(" ");
	System.out.print("Select your option (1-8): ");
	int callRegisterOption = press.nextInt();
	
		switch(callRegisterOption){
		case 1:
		System.out.println("Missed calls");
		break;
		
		case 2: 
		System.out.print("Received calls");
		break;

		case 3:
		System.out.println("Dialled numbers");
		break;
	
		case 4:
		System.out.println("Erase recent call lists");
		break;
		
		case 5:
		System.out.println("1. Last call duration \n2. All calls' duration \n3. Recieved calls' duration \n4. Dialled calls' duration \n5. Clear timers");
		System.out.print(" ");
		System.out.print("Press a number to select (1-5): ");
		int showCallDurationOption = press.nextInt();
			switch(showCallDurationOption){
			case 1:
			System.out.println("Last call duration");
			break;
		
			case 2: 
			System.out.print("All calls' duration");
			break;

			case 3:
			System.out.println("Recieved calls' duration");
			break;
	
			case 4:
			System.out.println("Dialled calls' duration");
			break; 

			case 5:
			System.out.println("Clear timers");
			break; 
		}break;

		case 6:
		System.out.println("1. Last call cost \n2. All calls' cost \n3. Clear counters");
		System.out.print(" ");
		System.out.print("Press a number to select (1-3): ");
		int showCallCostsOption = press.nextInt();
			switch(showCallCostsOption){
			case 1:
			System.out.println("Last call cost");
			break;
		
			case 2: 
			System.out.print("All calls' cost");
			break;

			case 3: 
			System.out.print("Clear counters");
			break;

			}break;

		case 7:
		System.out.println("1. Call cost limit \n2. Show costs in");
		System.out.print(" ");
		System.out.print("Press a number to select (1-2): ");
		int callCostSettingsOption = press.nextInt();
			switch(callCostSettingsOption){
			case 1:
			System.out.println("Call cost limit");
			break;
		
			case 2: 
			System.out.print("Show costs in");
			break;
		  }break;

		case 8:
		System.out.println("Prepaid credit");
		break;

		}break;

	case 5:
	System.out.print("Tones\n");
	System.out.println("1. Ringing tone \n2. Ringing volume \n3. Incoming call alert \n4. Composer \n5. Message alert tone \n6. Keypad tones \n7. Warning and game tone \n8. Vibrating alert \n9. Screen saver");
       System.out.print("press a number from 1-9 to select: ");
	int tonesOption = press.nextInt();
	     switch(tonesOption){
		case 1: 
		System.out.print("Ringing tone");
		break;

		case 2: 
		System.out.print("Ringing volume");
		break;

		case 3:
		System.out.print("Incoming call alert");
		break;
	
		case 4:
		System.out.print("Composer");
		break;
		
		case 5:
		System.out.print("Message alert tone");
		break;

		case 6:
		System.out.print("Keypad tones");
		break;

		case 7:
		System.out.print("Warning and game tones");
		break;

		case 8:
		System.out.print("Vibrating alert");
		break;

		case 9:
		System.out.print("Screen saver");
		break;
		} break;


	case 6:
	System.out.println("Settings");
	System.out.println(" ");
	System.out.println("1. Call settings \n2. Phone settings \n3. Security settings \n4. Restore factory settings"); 
	System.out.println(" ");
	System.out.print("Enter a number to select (1-4): ");
	int settingsOption = press.nextInt();
		switch(settingsOption){
		case 1: 
		System.out.println("Call settings");
		System.out.println("1. Automatic redial 1 \n2. Speed dialling \n3. Call waiting options \n4. Own number sending \n5. Phone line in use \n6. Automatic answer");
		System.out.print(" ");
		System.out.print("Press a number to select (1-6): ");
	int callSettingsOption = press.nextInt();
			switch(callSettingsOption){
		           case 1:
			   System.out.print("Automatic redial");
			   break;

			   case 2:
			   System.out.print("Speed dialling");
			   break;

			   case 3:
			   System.out.print("Call waiting options");
			   break;

			   case 4:
			   System.out.print(" Own number sending");
			   break;

			   case 5:
			   System.out.print("Phone line in use");
			   break;

			   case 6:
			   System.out.print("Automatic answer");
			   break;
                        }break;

		case 2: 
		System.out.print("Phone settings");
		System.out.println("1. Language \n2. Cell info display \n3. Welcome note \n4. Network selection \n5. Lights \n6. Confirm SIM service actions");
		System.out.print(" ");
		System.out.print("Press a number to select (1-6): ");
		int phoneSettingsOption = press.nextInt();
			switch(phoneSettingsOption){
			case 1:
			System.out.print("Language");
			break;

			case 2: 
			System.out.print("Cell info display");
			break;
			
			case 3:
			System.out.print("Welcome note");
			break;

			case 4: 
			System.out.print("Network selection");
			break;

			case 5:
			System.out.print("Lights");
			break;

			case 6: 
			System.out.print("Confirm SIM service actions");
			break;
               }break;

		case 3:
		System.out.println("Security settings");
		System.out.println("1. PIN code request \n2. Call barring service \n3. Fixed dialling \n4. Closed user group \n5. Phone security \n6. Change access codes");
		System.out.print(" ");
		System.out.print("Press a number to select (1-6): ");
		int securitySettingsOption = press.nextInt();
			switch(securitySettingsOption){
			case 1:
			System.out.print("PIN code request");
			break;

			case 2: 
			System.out.print("Call barring service");
			break;
			
			case 3:
			System.out.print("Fixed dialling");
			break;

			case 4: 
			System.out.print("Closed user group");
			break;

			case 5:
			System.out.print("Phone security");
			break;

			case 6: 
			System.out.print("Change access codes");
			break;
		       }break;
	
		case 4:
		System.out.println("Restore factory settings");
		break;
		} break;
	

	case 7:
	System.out.println("Call divert");
	break;	

	case 8:
	System.out.println("Games");
	break;

	case 9:
	System.out.println("Calculator");
	break;
 
	case 10:
	System.out.println("Reminder");
	break;

	
	case 11:
	System.out.println("Clock");
	System.out.println(" ");
	System.out.println("1. Alarm clock \n2. Clock settings \n3. Date settings \n4. Stopwatch \n5. Countdown timer \n6. Auto update of date and time"); 
	System.out.print("Press a number from 1-6 to select: ");
	int clockOption = press.nextInt();
		switch(clockOption){
		case 1:
		System.out.print("Alarm clock");
		break;

		case 2: 
		System.out.print("Clock settings");
	        break;
               
		case 3:
		System.out.print("Date settings");
		break;

		case 4:
		System.out.print("Stopwatch");
		break;
		
		case 5:
		System.out.print("Countdown timer");
		break;
		
		case 6:
		System.out.print("Auto update of date and time");
		break;
             }break;


	case 12:
	System.out.println("Profiles");
	break;
 
	case 13:
	System.out.println("SIM services");
	break;



}















}

}