package week11.interfaces.examples;

public class TestMenu {

	public static void main(String[] args) {
		Sandwich burger = new Sandwich("Cheeseburger", 30);
		Sandwich chicken = new Sandwich("Chicken Sandwich", 40);
		Sandwich nutella = new Sandwich("Nutella Sandwich", 35);
		
		Salad greenSalad = new Salad("Green Salad", 22);
		Salad greekSalad = new Salad("Greek Salad", 35);
		
		Drink coke = new Drink("Coke", 18);
		Drink juice = new Drink("Orange Juice", 5);
		Drink ayran = new Drink("Ayran", 20);
		
		Trio trio1=new Trio(nutella,greekSalad,juice);
		System.out.println(trio1);
		Trio trio2=new Trio(chicken,greenSalad,ayran);
		System.out.println(trio2);
		
		
		
		
		
		
	}

}
