package factory;

public class ChicagoStyleCheesePizza  extends Pizza{

	public ChicagoStyleCheesePizza() {
		name="chicago Style Deep Dish Cheese Pizza";
		dough="Extra Thick Crust Dough";
		sauce="Marinara Sauce";
		
		toppings.add("Shredded Mozarella Chesse");
				
		
	}

	@Override
	public void cut() {
	System.out.println("Cutting the pizza into square slices");
	}
	
	

	
	
}
