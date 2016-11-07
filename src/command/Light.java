package command;

public class Light {

	String name;
	
	
	public Light(String name) {
		super();
		this.name = name;
	}

	public void on(){
		System.out.println(getClass().getName() + "--"+name+" light on()");
	}
	
	public void off(){
		System.out.println(getClass().getName() + "--"+name+" light off()");
	}
	
	
	
}
