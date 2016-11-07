package factory;

import factory.ingredient.NYPizzaIngredientFactory;
import factory.ingredient.PizzaIngredientFactory;

public class NewYorkPizzaStore extends PizzaStore {


	@Override
	Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

		
		if (type.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
		} else if (type.equals("pepperoni")) {
			pizza = new NyStylePepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new NyStyleClamPizza();
		} else if (type.equals("veggie")) {
			pizza = new NyStyleVeggiePizza();
		}

		return pizza;
	}

}
