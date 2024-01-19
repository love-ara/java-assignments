
import java.util.Arrays;
public class ConcatenateLists{


	public static Object[] concatenateArray(Object[] array1, Object[] array2){
	int length1 = array1.length;
	int length2 = array2.length;
	Object[] thisArray = new Object[length1+length2];
	
	for(int index = 0; index < length1; index++){
	 thisArray[index] = array1[index];
}

	for(int index = 0; index < length2; index++){
	thisArray[length1 + index] = array2[index];
}

	//System.arraycopy(array1, 0, thisArray, 0, length1);
	//System.arraycopy(array2, 0, thisArray, length1, length2);
	System.out.println(Arrays.toString(thisArray));
	return thisArray;
}







}