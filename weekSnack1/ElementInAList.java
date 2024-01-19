 
public class ElementInAList{


	public boolean elementInList(int[] array, int element){
	
	/**for(int count = 0; count <= array.length-1; count++){
	if(array[count] == element){
	return true;
}
}
	return false;
}

	public boolean StringElementInAList(String[] aDiffArray, String anotherElement){

	for(int count = 0; count <= aDiffArray.length-1; count++){
	if(aDiffArray[count] == anotherElement){
	return true;
}

}
	return false;
}
}**/
	for(int elements : array){
		if(elements == element){
			return true;
}
}
		return false;

}
}