import java.util.Arrays;

	public class ReverseList{

	public int[] reverse(int[] array){

	int[] thisArray = new int[array.length];
	int count = 0;
	for(int index = array.length-1; index >= 0; index--){
	thisArray[count] = array[index];
	count++;	

}
	System.out.print(Arrays.toString(thisArray));
	return thisArray;

}







}