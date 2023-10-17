package week3.examples;

public class MultiDimArrayExample {

	public static void main(String[] args) {
		int[][] numbers=new int[2][4];
		
		numbers[0][2]=9;
		numbers[1][3]=20;
		System.out.println();
		
		for (int i = 0; i < numbers.length; i++) {
			//int[] line=numbers[i];
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j]+" ");
			}
			System.out.println();
		}

	}

}
