package command;

import log.Log;

public class GarageDoor {

	String name;
	
	public GarageDoor(String name) {
		super();
		this.name = name;
	}

	public void up(){
		Log.i(getClass().getName() + "--"+name+"Garge Door up...");
	}
	
	public void down(){
		Log.i(getClass().getName() + "--"+name+"Garge Door down...");
	}
	
	public void stop(){
		Log.i(getClass().getName() + "--"+name+"Garge Door stop...");
	}
	
	public void lightOn(){
		Log.i(getClass().getName() + "--"+name+"Garge Door light on...");
	}
	
	public void lightOff(){
		Log.i(getClass().getName() + "--"+name+"Garge Door light off...");
	}
	
	
	
}
