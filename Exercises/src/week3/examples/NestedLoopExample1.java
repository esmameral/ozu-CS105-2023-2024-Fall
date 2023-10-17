package week3.examples;

public class NestedLoopExample1 {
public static void main(String[] args) {
	int lineCount=6;
	for(int i=1;i<=lineCount;i++) {
		for(int j=1;j<=lineCount-i;j++) {
			System.out.print(".");
		}
		System.out.print(i);
		System.out.println();
	}
}
}
