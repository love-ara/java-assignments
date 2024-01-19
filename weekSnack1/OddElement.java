
public class OddElement{

	public int[] oddPositions(int[] nums){
	 int[] newArrayList = new int[nums.length/2];

	int count = 0;
	for(int index = 0; index < nums.length; index+=2){

	newArrayList[count] = nums[index];
	count++;
	
}
		return newArrayList;
}
		
		











}