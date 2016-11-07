package command;

import log.Log;

public class Stereo {

	String name;
	
	
	public Stereo(String name) {
		super();
		this.name = name;
	}
	public void on(){
		Log.i(getClass().getName()+"--"+name+" on...");
	}
	public void off(){
		Log.i(getClass().getName()+"--"+name+" off...");
	}
	public void setCd(){
		Log.i(getClass().getName()+"--"+name+" setCd...");
	}
	public void setDvd(){
		Log.i(getClass().getName()+"--"+name+" setDvd...");
	}
	public void setRadio(){
		Log.i(getClass().getName()+"--"+name+" setRadio...");
	}
	public void setVolume(int volume){
		Log.i(getClass().getName()+"--"+name+" volume:"+volume);
	}
	
}
