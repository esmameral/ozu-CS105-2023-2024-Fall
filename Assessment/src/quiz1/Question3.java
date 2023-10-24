package quiz1;

public class Question3 {
	public static void main(String[] args) {
		
		int[] arr = { 4, 2, 9, 7, 3 };
		for (int k : arr) {
			k = k + 10;
			System.out.print(k + " ");
		}
		for (int k=0;k<arr.length-1;k++) {
			k=k+1;
			System.out.print(arr[k] + " ");
		}


	}
}
