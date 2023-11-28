package week9.examples;

public class ClassA {
	private int var1;
	public ClassA() {
		
		System.out.print("A");
	}
	
	public ClassA(int var1) {
		super();
		this.var1 = var1;
		System.out.print("B");
	}
	public void method1() {
		System.out.print("X");
	}

	public int getVar1() {
		return var1;
	}

	public void setVar1(int var1) {
		this.var1 = var1;
	}
	
	public void methodxx() {
		
	}

}
