package command;

import java.util.ArrayList;
import java.util.List;

public class MacroCommandLoader {

	public static void main(String args[]){
		Light livingRoomLight=new Light("Living Room");
		
		Stereo stereo=new Stereo("Living Room");
		
		LightOnCommand livingRoomLightOnCommand=new LightOnCommand(livingRoomLight);
		StereoOnWithCDCommand livingRoomStereoOnCommand=new StereoOnWithCDCommand(stereo);
		
 		LightOffCommand livingRoomLightOffCommand=new LightOffCommand(livingRoomLight);
 		StereoOffCommand liveingRoomstereoOffCommand=new StereoOffCommand(stereo);
		
		
		
		List<Command> commandsOn=new ArrayList<Command>();
		commandsOn.add(livingRoomStereoOnCommand);
		commandsOn.add(livingRoomLightOnCommand);
		MacroCommand macroCommandOn=new MacroCommand(commandsOn);
		
		List<Command> commandsOff=new ArrayList<Command>();
		commandsOff.add(livingRoomLightOffCommand);
		commandsOff.add(liveingRoomstereoOffCommand);
		MacroCommand macroCommandOff=new MacroCommand(commandsOff);
		
		RemoteControl remoteControl=new RemoteControl();
		remoteControl.setCommand(0, macroCommandOn, macroCommandOff);
		
		remoteControl.onButtonWasPushed(0);
		System.out.println("......turn off.....................");
		remoteControl.offButtonWasPushed(0);
		System.out.println("......undo.....................");
		remoteControl.undoButtonWasPushed();
		
		
		
	}
}
