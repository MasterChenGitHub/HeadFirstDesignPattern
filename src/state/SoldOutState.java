package state;

public class SoldOutState implements State {

	private GumballMachine gumballMachine;
	
	public SoldOutState(GumballMachine gumballMachine) {
		super();
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		print("You can't insert a quarter, the machine is sold out");
		
	}

	@Override
	public void ejectQuarter() {
		print("You can't eject, you haven't inserted a quarter yet");
		
	}

	@Override
	public void turnCrank() {
		print("You turned but there's no gumballs");
		
	}

	@Override
	public void dispense() {
		print("No gumball dispensed");
		
	}

	void print(String s){
		System.out.println(s);
	}
}
