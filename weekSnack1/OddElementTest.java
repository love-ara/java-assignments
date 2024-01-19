import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


	public class OddElementTest{


	@Test
	public void testThatThisWillReturnOddElements(){
	OddElement oddElement = new OddElement();
	int[] array = {3, 4, 6, 9, 1, 2};
	int[] newArray = oddElement.oddPositions(array);
	int[] expected = {3, 6, 1};
	assertArrayEquals(expected, newArray);
	

}




}