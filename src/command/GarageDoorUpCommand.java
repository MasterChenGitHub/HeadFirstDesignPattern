package command;

public class GarageDoorUpCommand implements Command {

	GarageDoor gargeDoor;

	public GarageDoorUpCommand(GarageDoor garageDoor) {
		this.gargeDoor = garageDoor;
	}

	@Override
	public void execute() {

		gargeDoor.up();
	}

	@Override
	public void undo() {
		gargeDoor.down();
	}

}
