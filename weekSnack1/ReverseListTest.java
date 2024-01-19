import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


 	public class ReverseListTest{

	@Test
	public void testThatThisReversesAList(){
	ReverseList reverser = new ReverseList();
	int[] theList = {1, 2, 3, 4, 5, 8};
	int[] callMethod = reverser.reverse(theList);
	int[] result = {8, 5, 4, 3, 2, 1};
	assertArrayEquals(result, callMethod);
}







}