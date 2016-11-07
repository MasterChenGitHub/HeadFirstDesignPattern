package factory;

public class PizzaTest {

	public static void main(String[] args) {
		PizzaStore nyPizzastore=new NewYorkPizzaStore();
		Pizza pizza=nyPizzastore.orderPizza("cheese");
		System.out.println("Ethan ordered a "+pizza.getName()+"\n");
		
		
		PizzaStore chicagoPizzastore=new ChicagoPizzaStore();
		pizza=chicagoPizzastore.orderPizza("cheese");
		
		System.out.println("Joel ordered a "+pizza.getName()+"\n");

		

	}

}
