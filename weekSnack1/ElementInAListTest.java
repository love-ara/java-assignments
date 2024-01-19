import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


	public class ElementInAListTest{

	@Test
	public void testThatThisChecksForAnElementInAList(){
	ElementInAList obj = new ElementInAList();
	int[] array = {1, 3, 4, 2, 5};
	int expected = 4;
	boolean callMethod = obj.elementInList(array, expected);
	assertTrue(callMethod);
}
	@Test
	public void testThatThisCheckStringElement(){
	ElementInAList object = new ElementInAList();
	String[] array1 = {"i", "am", "going", "to", "be", "amazing"};
	String expectedStr = "amazing";
	boolean callMethod1 = object.StringElementInAList(array1, expectedStr);
	assertTrue(callMethod1);

}

}

	