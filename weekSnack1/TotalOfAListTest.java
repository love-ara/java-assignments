import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

	public class TotalOfAListTest{

	@Test
	public void testThatThisReturnsTotal(){
	TotalOfAList sum = new TotalOfAList();
	
	int[] array = {1, 4, 6, 7};
	int callMethod = sum.totalOfAList(array);
	int expectedTotal = 18;
	assertEquals(expectedTotal, callMethod);




}








}