import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


	public class PalindromeCheckerTest{

	@Test
	public void testThatThisChecksForStringPalindrome(){
	//StringPalindrome var = new StringPalindrome();
	//String word = "geek";
	//word =  word.toLowerCase();
	//String expected = "keeg";
	//boolean callMethod = .isPalindrome(word, expected);
	//assertFalse(callMethod);

	assertFalse(PalindromeChecker.isPalindrome("geek"));
	assertTrue(PalindromeChecker.isPalindrome("madam"));
}







}