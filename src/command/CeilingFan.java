package command;

import log.Log;

public class CeilingFan {

	
	public static final int HITH=3;
	public static final int MEDIUM=2;
	public static final int LOW=1;
	public static final int OFF=0;
	
	private String name;
	private int speed = 1;
	

	public CeilingFan(String name) {
		this.name = name;
	}

	public void high() {
		Log.i(getClass().getName() + "--"+name+" high...");
		speed = HITH;
	}

	public void medium() {
		Log.i(getClass().getName() + "--"+name+" medium...");
		speed = MEDIUM;
	}

	public void low() {
		Log.i(getClass().getName() + "--"+name+" low...");
		speed = LOW;
	}

	public void off() {
		Log.i(getClass().getName() + "--"+name+" off...");
		speed = OFF;
	}

	public int getSpeed() {
		Log.i(getClass().getName() +"--"+name+ " getSpeed...");
		return speed;
	}
	
	
}
