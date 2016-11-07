package factory.ingredient;

public interface PizzaIngredientFactory {

	public Dough createDough();

	public Cheese createCheese();

	public Clams createClams();

	public Pepperoni createPepperoni();

	public Sauce createSauce();

	public Veggies[] createVeggies();

}
