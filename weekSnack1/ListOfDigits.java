import java.util.Arrays;

public class ListOfDigits{

public static void main(String[] args){
	int num = 12345;
	int [] newArray = getDigitsArray(num);

	System.out.print(Arrays.toString(newArray));
}

	public static int[] getDigitsArray(int numbers){
		String numStr = numbers + "";
		int length = numStr.length();

		int[] array = new int[length];

		for(int index = array.length-1; index >= 0; index--){
		array[index] = numbers%10;
		numbers = numbers/10;

}
		return array;
}
}