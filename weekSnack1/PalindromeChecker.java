
public class PalindromeChecker{


	public static boolean isPalindrome(String  theStr){
	String txt = theStr.toLowerCase();
	int count = txt.length()-1;
	for(int i = 0; i < count/2;i++){

	if(txt.charAt(i) != txt.charAt(count-i)){
	System.out.println("It is not a palindrome");
	return false;
	
}
	//count--;

	
}
	System.out.print("It is a palindrome");
	return true;

}
}


