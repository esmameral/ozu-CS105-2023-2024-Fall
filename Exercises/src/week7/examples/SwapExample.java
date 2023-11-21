package week7.examples;

public class SwapExample {

	public static void main(String[] args) {
		int a=9,b=10;
		System.out.println("Before:"+a);
		System.out.println("Before:"+b);
		swap(a,b);
		System.out.println("After:"+a);
		System.out.println("After:"+b);

	}
	public static void  swap (int first, int second)
	{
	        int temp = first;
	        first = second;
	        second = temp;
	        System.out.println("Swap method(first):"+first);
	        System.out.println("Swap Method(second):"+second);
	}
}
