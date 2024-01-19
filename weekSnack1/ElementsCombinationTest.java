import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


	public class ElementsCombinationTest{




	@Test
	public void testThatThisMethodCanCombineElements(){

	ElementsCombination combo = new ElementsCombination();

	Object[] array1 = {"a", "b", "c"};
	Object[] array2 = {1, 2, 3};
	Object[] expected = {"a", 1, "b", 2, "c", 3};

	Object[] result = combo.elementsCombination(array1, array2);

	assertArrayEquals(expected, result);








}
















}