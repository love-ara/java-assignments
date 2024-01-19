import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


	public class EvenPositionTest{

	@Test
	public void testThatThisMethodReturnsElementsOnEvenPositions(){
	EvenPosition evens = new EvenPosition();
	int[] firstArray = {1, 2, 3, 4, 5, 6};
	int[] callMethod = evens.evenElements(firstArray);
	int[] expected = {2, 4, 6};
	assertArrayEquals(expected, callMethod);
	

}












}