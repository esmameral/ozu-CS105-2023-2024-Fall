package week8.examples;

public class TestInheritance {

	public static void main(String[] args) {
		Policy pol=new Policy();
		pol.setClient("kerem");
		pol.setPolicyNumber("67");
		
		
		HomePolicy home=new HomePolicy();
		home.setClient("ayse");
		home.setPolicyNumber("123");
		home.setHomeInfo("uskudar");
		System.out.println(home);

	}

}
