package week7.examples;

public class PassByValueByReferenceExample {

	public static void main(String[] args) {
	    String code=new String("CS105");
	    System.out.println("(before update) code:"+code);
	    updateCode(code);
	    System.out.println("(after update) code:"+code);
	}

	private static void updateCode(String code) {
	    System.out.println("(inside method before update) code:"+code);
	    code=new String("CS101");
	    System.out.println("(inside method after update) code:"+code);
	}

}
