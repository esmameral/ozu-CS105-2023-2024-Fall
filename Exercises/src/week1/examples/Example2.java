package week1.examples;

/*
 * What will be printed on the screen when the following program is run?
 */
public class Example2 {
	public static void main(String[] args) {
		int a = 5; //a=5
		int b = 3; //b=3
		int c = a * (a + b); //c=5*(5+3)=5*8=40
		b++;//b=4
		c += b + c; //c=c+(b+c)=40+4+40=84
		int d = c--;//d=84 c=83
		int e = ++b; //b=5 e=5
		System.out.println("a=" + a + " b=" + b + " c=" + c + " d=" + d + " e=" + e);
	}
}
