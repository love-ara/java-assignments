import java.util.Arrays;

	public class EvenPosition{


	public int[] evenElements(int[] numbers){
 	int[] newArrayList = new int[numbers.length/2];

	int index = 0;
	for(int count = 1; count < numbers.length; count+=2){

	newArrayList[index] = numbers[count];
	index++;


}
	System.out.print("arrays:- " + Arrays.toString(elements));
	return newArrayList;
}
}