package command;

public class RemoteLoader {

	public static void main(String[] args) {

		RemoteControl remoteControl=new RemoteControl();
		
		Light livingRoomLight=new Light("Living Room");
		Light kitchenLight=new Light("Kitchen");
		CeilingFan ceilingFan=new CeilingFan("Livring Room");
		GarageDoor garageDoor=new GarageDoor("");
		Stereo stereo=new Stereo("Liveing Room");
		
		
		LightOnCommand livingRoomLightOn=new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff=new LightOffCommand(livingRoomLight);
		
		LightOnCommand kitchenLightOn=new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff=new LightOffCommand(kitchenLight);
		
		CeilingFanHighCommand ceilingFanHighCommand=new CeilingFanHighCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOffCommand=new CeilingFanOffCommand(ceilingFan);
		CeilingFanMediumCommand ceilingFanMediumCommand=new CeilingFanMediumCommand(ceilingFan);
		
		
		GarageDoorUpCommand garageDoorUpCommand=new GarageDoorUpCommand(garageDoor);
		GarageDoorDownCommand garageDoorDownCommand=new GarageDoorDownCommand(garageDoor);
		
		StereoOnWithCDCommand stereoOnWithCDCommand=new StereoOnWithCDCommand(stereo);
		StereoOffCommand stereoOffCommand=new StereoOffCommand(stereo);
		
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
//		remoteControl.setCommand(2, ceilingFanHighCommand, ceilingFanOffCommand);
		remoteControl.setCommand(3, stereoOnWithCDCommand, stereoOffCommand);
		
		System.out.println(remoteControl);
		
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
		remoteControl.onButtonWasPushed(3);
		remoteControl.undoButtonWasPushed();
		remoteControl.offButtonWasPushed(3);
		
		remoteControl.undoButtonWasPushed();
		
		remoteControl.onButtonWasPushed(4);
		remoteControl.offButtonWasPushed(4);
		
		remoteControl.setCommand(5, ceilingFanMediumCommand, ceilingFanOffCommand);
		remoteControl.setCommand(6, ceilingFanHighCommand, ceilingFanOffCommand);
		
		remoteControl.onButtonWasPushed(5);
		remoteControl.offButtonWasPushed(5);
		remoteControl.undoButtonWasPushed();
	}

}
