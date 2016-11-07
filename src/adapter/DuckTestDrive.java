package adapter;

import log.Log;

public class DuckTestDrive {

	public static void main(String[] args) {

		MallardDuck duck=new MallardDuck();
		
		WildTurkey turkey=new WildTurkey();
		
		Duck turkeyAdapter=new TurkeyAdapter(turkey);
		
		Log.i("The turkey says ...");
		turkey.gobble();
		turkey.fly();
		
		Log.i("\nThe Duck says...");
		testDuck(duck);
		
		Log.i("\nthe TurkeyAdapter says...");
		testDuck(turkeyAdapter);
	}
	
	
	public static void testDuck(Duck duck){
		duck.quack();
		duck.fly();
	}

}
