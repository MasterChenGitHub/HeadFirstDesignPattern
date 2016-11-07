package factory;

import java.util.ArrayList;
import java.util.List;

import factory.ingredient.Cheese;
import factory.ingredient.Clams;
import factory.ingredient.Dough;
import factory.ingredient.Pepperoni;
import factory.ingredient.Sauce;
import factory.ingredient.Veggies;

public abstract class Pizza {

	String name;
	Dough dough;
	Sauce sauce;
	Veggies veggies[];
	Cheese cheese;
	Pepperoni pepperoni;	
	Clams clam;
	List<String> toppings=new ArrayList<String>();
	
	public abstract void prepare();
	public  void bake(){
		print("Bake for 25 minutes at 350");
	}
	public  void cut(){
		print("Cutting the pizza into diagonal slices");
	}
	public  void box(){
		print("Place pizza in official PizzaStore box");
	}
	public String getName() {
		return name;
	}
	
	
	
	public void setName(String name) {
		this.name = name;
	}
	void print(String s){
		System.out.println(s);
	}
}
