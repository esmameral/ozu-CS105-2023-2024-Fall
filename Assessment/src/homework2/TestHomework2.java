package homework2;

public class TestHomework2 {
	public static void main(String[] args) {
		
		Utility utility=new Utility();
		//Test method1(isPrime)
		int number = 29;
		boolean isPrime = utility.isPrimeNumber(number);
		
		if(isPrime)
			System.out.println(number+" is prime number");
		else
			System.out.println(number+" is not prime number");
		
		//Test method2 (printMinAndMaxPrimeNumbers)
		utility.printMinAndMaxPrimeNumbers(1,20 );
		
		//Test method3 (findLetterCount)
		String text ="suppiluliuma";
		String letter="M";
		int count=utility.findLetterCount(text,letter);
		System.out.println("Found "+count+" '"+letter+"' in the text '"+text+"'");
		
		//Test method4 (isArraySorted)
		double[] arr1= {12,12,16,20,34};
		if(utility.isArraySorted(arr1)) {
			System.out.println("Array1 is sorted");
		}else
			System.out.println("Array1 is not sorted");
		
		double[] arr2= {18,8,6,4,-1,-1,-1};
		if(utility.isArraySorted(arr2)) {
			System.out.println("Array2 is sorted");
		}else
			System.out.println("Array2 is not sorted");
		
		
		double[] arr3= {18,28,6,9};
		if(utility.isArraySorted(arr3)) {
			System.out.println("Array3 is sorted");
		}else
			System.out.println("Array3 is not sorted");
		
		double[] arr4= {1,1,1,1,1,1,1};
		if(utility.isArraySorted(arr4)) {
			System.out.println("Array4 is sorted");
		}else
			System.out.println("Array4 is not sorted");
	}
}
