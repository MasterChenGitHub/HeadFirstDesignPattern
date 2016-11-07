package state;

public class GumballMachine {

	State soldState;
	State noQuarterState;
	State hasQuarterState;
	State soldOutState;
	State winnerState;
	
	State state=soldOutState;
	int count=0;
	public GumballMachine(int numberGumballs) {
		super();
		this.count = numberGumballs;
		soldState=new SoldState(this);
		soldOutState=new SoldOutState(this);
		hasQuarterState=new HasQuarterState(this);
		noQuarterState=new NoQuarterState(this);
		winnerState=new WinnerState(this);
		
		if(numberGumballs>0){
			state=noQuarterState;
		}
		
	}
	
	public void insertQuarter(){
		state.insertQuarter();
	}
	public void ejectQuarter(){
		state.ejectQuarter();
	}
	public void turnCrank(){
		state.turnCrank();
		state.dispense();
	}
	public void setState(State state){
		this.state=state;
	}
	
	void releaseBall(){
		System.out.println("A gumball comes rolling out the slot...");
		if(count!=0){
			count=count-1;
		}
	}

	public State getSoldState() {
		return soldState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public State getState() {
		return state;
	}

	public int getCount() {
		return count;
	}

	@Override
	public String toString() {
	
		return "state:"+state.toString()+",count:"+count;
	}

	public State getWinnerState() {
		return winnerState;
	}
	
	void refill(int count){
		this.count=count;
		if(count>0){
			this.state=noQuarterState;
		}
	
		
	}
	
}
