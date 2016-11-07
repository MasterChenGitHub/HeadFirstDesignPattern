package state;

public class GumballmachineTestDrive {

	public static void main(String[] args) {

		GumballMachine gumballMachine=new GumballMachine(5);
		
		pirntState(gumballMachine);
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		
		pirntState(gumballMachine);
		
		
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		pirntState(gumballMachine);
		
	
		
	}

 static	void pirntState(GumballMachine gumballMachine){
		System.out.println(gumballMachine.toString());
		System.out.println("--------------------------------");
	}
	
	void print(String s) {
		System.out.println(s);
		
	}
}
