package week3.examples;
//•	Create an array with numbers {4,6,1,8,9,7} 
//•	Print the elements of the array at the indices 3 and 5. 
//•	Print the size of the array.
//•	Print all elements of this array on the screen.

public class Week3Question2 {

	public static void main(String[] args) {
//		int[] array= {4,6,1,8,9,7};
//		System.out.println("Length:"+array.length);
//		System.out.println(array[3]);//8
//		System.out.println(array[5]);//7
//		//System.out.println(array[6]);//throws ArrayIndexOutOfBoundsException
//		array[5]=19;
//		System.out.println(array[5]);
		
		int[] numbers= new int[10];
		numbers[0]=1; 
		numbers[3]=2;
		numbers[4]=4;
		numbers[6]=10;
		//numbers[10]=15;throws ArrayIndexOutOfBoundsException
	 
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("numbers["+i+"]:"+numbers[i]);
		}
		
		for (int element : numbers) {
			System.out.println(element);
		}
		

	}

}
