package state;

public class WinnerState implements State {

	private GumballMachine gumballMachine;
	
	
	public WinnerState(GumballMachine gumballMachine) {
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
		
	print("YOU'RE A WINNER! You get two gumballs for your quarter");
	gumballMachine.releaseBall();
	if(gumballMachine.getCount()==0){
		gumballMachine.setState(gumballMachine.getSoldOutState());
	}else{
		gumballMachine.releaseBall();
		
		if(gumballMachine.getCount()>0){
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		}else{
			print("Oops, out of gumballs!");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}
		
	}

	void print(String s){
		System.out.println(s);
	}
}
