import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

	public class SumOfNumbersTest{


	@Test
	public void testThatThisComputesSum(){

	SumOfNumbers sum = new SumOfNumbers();
	int[] theList = {1, 3, 5, 6};
	int callMethod = sum.sumOfNumbers(theList);
	int expectedTotal = 15;
	assertEquals(expectedTotal, callMethod);



}

	@Test
	public void testThatThisComputesSumWhileLoop(){

	SumOfNumbers plus = new SumOfNumbers();
	int[] theList1 = {1, 3, 5, 6};
	int callMethod1 = plus.sumOfNumbers1(theList1);
	int expectedTotal1 = 15;
	assertEquals(expectedTotal1, callMethod1);

}
	
	@Test
	public void testThatThisComputesSumInDoWhile(){

	SumOfNumbers add = new SumOfNumbers();
	int[] theList2 = {1, 3, 5, 6};
	int callMethod2 = add.sumOfNumbers2(theList2);
	int expectedTotal2 = 15;
	assertEquals(expectedTotal2, callMethod2);



}
}