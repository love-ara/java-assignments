
import java.util.Arrays;

public class ElementsCombination{



	public Object[] elementsCombination(Object[] list1, Object[] list2){
	int length1 = list1.length;
	int length2 = list2.length;
	
	Object[] combinedArray = new Object[length1 + length2];

	int index = 0;
	int list1Index = 0;
	int list2Index = 0;

	while(list1Index < length1 || list2Index < length2){
	if(list1Index < length1){
	combinedArray[index++] = list1[list1Index++];
}
	if(list2Index < length2){
	combinedArray[index++] = list2[list2Index++];
}

}

	
	System.out.print(Arrays.toString(combinedArray));
	return combinedArray;

}















}