package adapter;

import log.Log;

public class WildTurkey implements Turkey{

	@Override
	public void gobble() {
		Log.i("Gobble gobble");
	}

	@Override
	public void fly() {
		Log.i("I'm flying a short distance");
	}

}
