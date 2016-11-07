package command;

public class RemoteControlTest {

	public static void main(String[] args) {

		SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
		
		//light command
		Light light = new Light("Living Room ");
		Command lightOn = new LightOnCommand(light);
		simpleRemoteControl.setCommand(lightOn);
		simpleRemoteControl.buttonWasPressed();
		
		//garge door command
		GarageDoor garageDoor=new GarageDoor("");
		Command garageOpen=new GarageDoorUpCommand(garageDoor);
		simpleRemoteControl.setCommand(garageOpen);
		simpleRemoteControl.buttonWasPressed();
		
		
		

		
		
		
	}

}
