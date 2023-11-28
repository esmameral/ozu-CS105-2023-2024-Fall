package week9.examples;

public class ClassB extends ClassA{
	private int var2;
	
	
	public ClassB(int var1, int var2) {
		this(var1);
		this.var2 = var2;
	}
	public ClassB(int var1) {
		super(var1);
		System.out.print("C");
		super.method1();
		System.out.print("D");
		this.method1();
		System.out.print("E");
	}
	public void method1() {
		System.out.print("F");
	}
	public int getVar2() {
		return var2;
	}
	public void setVar2(int var2) {
		this.var2 = var2;
	}

}
