import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

	public class ConcatenateListsTest{


	@Test
	public void testThatTheMethodCanConcatenateArray(){

	ConcatenateLists catenate = new ConcatenateLists();
	Object[] array1 = {"a", "b", "c"};
	Object[] array2 = {1, 2, 3};
	Object[] expected = {"a", "b", "c", 1, 2, 3};

	Object[] result = catenate.concatenateArray(array1, array2);
	assertArrayEquals(expected, result);
}











}