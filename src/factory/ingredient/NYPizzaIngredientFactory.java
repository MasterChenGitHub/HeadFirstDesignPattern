package factory.ingredient;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	@Override
	public Clams createClams() {
		return new FreshClams();
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies veggies[]= {new Gralic(),new Onion(),new Mushroom(),new RedPepper()};
		return veggies;
	}

}
