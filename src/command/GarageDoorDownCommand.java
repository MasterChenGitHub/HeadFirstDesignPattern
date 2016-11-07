package command;

public class GarageDoorDownCommand implements Command {

	GarageDoor gargeDoor;

	public GarageDoorDownCommand(GarageDoor garageDoor) {
		this.gargeDoor = garageDoor;
	}

	@Override
	public void execute() {

		gargeDoor.down();
	}

	@Override
	public void undo() {
		gargeDoor.up();
	}

}
