package adapter;

import log.Log;

public class MallardDuck implements Duck {

	@Override
	public void quack() {
		Log.i("Quack");
	}

	@Override
	public void fly() {
		Log.i("I'm flying");
	}

}
