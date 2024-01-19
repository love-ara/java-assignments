public class LargestElement{

	public int largestNumber(int[]  arrays){

		int largest = 0;
	for(int count = 0; count<=arrays.length-1; count++){
	if(arrays[count]> largest){
	largest = arrays[count];
		
}		
}
		return largest;


}








}