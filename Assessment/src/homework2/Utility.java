package homework2;

public class Utility {

	public boolean isPrimeNumber(int number) {
		for (int j = 2; j <= number / 2; j++) {
			if (number % j == 0)
				return false;
		}
		return true;
	}

	public void printMinAndMaxPrimeNumbers(int number1, int number2) {
		int max = 0;
		int min = 0;
		for (int i = number1; i <= number2; i++) {
			if (isPrimeNumber(i)) {
				max = i;
				if(min == 0)
					min = i;
			}
		}
		System.out.println("Min prime number is:" +min+" Max prime number is: "+max);
	}
	public int findLetterCount(String text, String letter) {
		int count=0;
		for(int i=0;i<text.length();i++) {
			if(text.substring(i, i+1).toUpperCase().equals(letter.toUpperCase()))
				count++;
			
		}
		return count;
		
	}
	
	
	
	public static boolean isArraySorted(double[] array){
        boolean  isSortedAsc=true;
        boolean isSortedDesc=true ;
        for (int i=1;i<array.length;i++){
            if(isSortedDesc&&array[i-1]>array[i]){
            	isSortedDesc=false;
            }
            if(isSortedAsc&&array[i-1]<array[i]){
            	isSortedAsc=false;
            }
        }
        return isSortedAsc || isSortedDesc;
    }
}
