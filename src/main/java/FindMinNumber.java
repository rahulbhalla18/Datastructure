
public class FindMinNumber {
	
	public static void main(String[] args) {
		int minNum = Integer.MAX_VALUE;
		int []myArray = { 13, 54, 75, 2, 78, 43, 1, 85, 85, 135, 3, 64, 53};
		int size = myArray.length;
		for (int index=0;  index < size/2 + 1; index++){
				    if( minNum > myArray[index]){
			 	        minNum = myArray[index];
				    }
				    if( minNum > myArray[size - index - 1]) {
				        minNum = myArray[size - index -1 ];
				    }

		}
		
		System.out.println("min val : "+ minNum);
		
		Math.min(1, 2);
	}

}
