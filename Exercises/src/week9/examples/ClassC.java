package week9.examples;

public class ClassC extends ClassB{
	private int var3;
	public ClassC(int var1, int var2, int var3) {
		super(var1, var2);
		
		this.var3=var3;
		System.out.print("G");
	}
	public void method1() {
		System.out.print("H");
	}
	public int getVar3() {
		return var3;
	}
	public void setVar3(int var3) {
		this.var3 = var3;
	}

}
