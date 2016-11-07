package command;

public class CeilingFanLowCommand implements Command {

	private CeilingFan ceilingFan;
	private int prevSpeed;

	public CeilingFanLowCommand(CeilingFan ceilingFan) {
		super();
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.low();
	}

	@Override
	public void undo() {

		switch (prevSpeed) {
		case CeilingFan.HITH:
			ceilingFan.high();
			break;
		case CeilingFan.MEDIUM:
			ceilingFan.medium();
			break;
		case CeilingFan.LOW:
			ceilingFan.low();
			break;
		case CeilingFan.OFF:
			ceilingFan.off();
			break;

		}

	}

}
