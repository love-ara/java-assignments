import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class LargestElementTest{


		@Test
		public void testThatThisMethodCanReturnTheLargestElement(){
		LargestElement large = new LargestElement();
		int[] array = {2, 9, 6, 3, 5};
		int result = large.largestNumber(array);
		assertEquals(9, result);
		




}



	










}