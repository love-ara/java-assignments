public class TotalOfAList{



	public int totalOfAList(int[] array){
	int[] thisArray = new int[array.length];

	int total = 0;
	for(int index = 0; index <= array.length-1; index++){
	
	total += array[index];
}
	System.out.print("The total is: " + total);
     return total;

}










}