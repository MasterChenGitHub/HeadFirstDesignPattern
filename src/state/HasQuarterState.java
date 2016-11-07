package state;

import java.util.Random;

public class HasQuarterState implements State {

	private GumballMachine gumballMachine;
	private Random randomWinner=new Random(System.currentTimeMillis());
	
	
	public HasQuarterState(GumballMachine gumballMachine) {
		super();
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		print("You can't insert another quarter");
	}

	@Override
	public void ejectQuarter() {
		
		gumballMachine.setState(gumballMachine.getNoQuarterState());
		print("Quarter returned");
		
	}

	@Override
	public void turnCrank() {
		print("You turned...");
	
		int winner=randomWinner.nextInt(10);
		
		if((winner==0)&&(gumballMachine.getCount()>1)){
			gumballMachine.setState(gumballMachine.getWinnerState());
		}else{
			gumballMachine.setState(gumballMachine.getSoldState());
		}
		
		
	}

	@Override
	public void dispense() {
		
		print("No gumball dispensed");
	}
	
	void print(String s){
		System.out.println(s);
	}

}
