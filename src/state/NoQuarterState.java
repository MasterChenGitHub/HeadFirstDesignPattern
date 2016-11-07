package state;

public class NoQuarterState implements State {

	private GumballMachine gumballMachine;

	public NoQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		print("You inserted a quarter");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
		
	}

	@Override
	public void ejectQuarter() {

		print("You haven't inserted a quarter");
	}

	@Override
	public void turnCrank() {

		print("You turned but there's no quarter");
	}

	@Override
	public void dispense() {
		print("You need to pay first");
	}

	void print(String s){
		System.out.println(s);
	}
}
