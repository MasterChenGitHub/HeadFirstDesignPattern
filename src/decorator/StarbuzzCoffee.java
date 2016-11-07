package decorator;

public class StarbuzzCoffee {

	public static void main(String args[]) {
		Beverage espresso = new Espresso();
		printBeverage(espresso);

		Beverage darkRoast = new DarkRoast();
		darkRoast = new Mocha(darkRoast);
		darkRoast = new Mocha(darkRoast);
		darkRoast = new Whip(darkRoast);
		printBeverage(darkRoast);
		
		Beverage houseBlend=new HouseBlend();
		houseBlend=new Soy(houseBlend);
		houseBlend=new Mocha(houseBlend);
		houseBlend=new Whip(houseBlend);
		printBeverage(houseBlend);

	}

	public static void printBeverage(Beverage b) {
		System.out.println(b.getDescription() + " $" + b.cost());
	}
}
