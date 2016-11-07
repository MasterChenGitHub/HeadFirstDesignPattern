package decorator;

public abstract class Beverage {

	String description="Unknown Beverage";
	
	static final int TALL=1;
	static final int GRANDE=2;
	static final int VENTI=3;
	
	
	int size=1;
	
	public abstract double cost();

	public String getDescription() {
		return description;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	
}
