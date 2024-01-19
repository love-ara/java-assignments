import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class ListOfDigitsTest{


	@Test
	public void testDigitArray(){

		ListOfDigits listOfDigits = new ListOfDigits();
		
		int input = 576;
		int[] returnedArray = ListOfDigits.getDigitsArray(input);
		int[] expected = {5, 7, 6};

		assertArrayEquals(expected, returnedArray);

}







}