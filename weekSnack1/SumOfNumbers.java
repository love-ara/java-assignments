


public class SumOfNumbers{


	public int sumOfNumbers(int[] array){
	int[] thisArray = new int[array.length];

	int sum = 0;
	for(int index = 0; index <= array.length-1; index++){
	sum += array[index];
}
	System.out.println("For loop:- " + sum);
	return sum;


}

	public int sumOfNumbers1(int[] nums){
	int[] thisArray = new int[nums.length];

	int sum = 0;
	int index = 0;

	while(index <= nums.length-1){
		sum+= nums[index];
		index++;

}
	System.out.println("While loop " + sum);
	return sum;

}
	public int sumOfNumbers2(int[] array){
	//int[] thisArray = new int[array.length];

	int sum = 0;
	int index = 0;


	do{
		sum += array[index];
		
		index++;
}
	while(index <= array.length-1);
	System.out.println("Do... while loop:- " + sum);
	return sum;
}
}