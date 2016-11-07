package factory.ingredient;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}

	@Override
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	@Override
	public Clams createClams() {
		return new FrozenClams();
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies veggies[]= {new EggPlant(),new Onion(),new Mushroom(),new RedPepper()};
		return veggies;
	}

}
