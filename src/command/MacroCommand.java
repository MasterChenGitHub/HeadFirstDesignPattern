package command;

import java.util.List;

public class MacroCommand implements Command {

	List<Command> commands;

	public MacroCommand(List<Command> commands) {
		super();
		this.commands = commands;
	}

	@Override
	public void execute() {

		for (Command c : commands) {
			c.execute();
		}

	}

	@Override
	public void undo() {
		for (Command c : commands) {
			c.undo();
		}
	}

}
