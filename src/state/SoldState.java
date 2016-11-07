package state;

public class SoldState implements State {

	private GumballMachine gumballMachine;
	
	public SoldState(GumballMachine gumballMachine) {
		super();
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		print("Please wait, we're already giving you a gumball");
		
	}

	@Override
	public void ejectQuarter() {
		print("Sorry, you already tured the crank");
		
	}

	@Override
	public void turnCrank() {
		print("Turning twice doesn't get you another gumball!");
		
	}

	@Override
	public void dispense() {

		gumballMachine.releaseBall();
		
		if (gumballMachine.getCount() == 0) {
			print("Oops, out of gumballs!");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		} else {
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		}

		
	}
	
	void print(String s){
		System.out.println(s);
	}

}
