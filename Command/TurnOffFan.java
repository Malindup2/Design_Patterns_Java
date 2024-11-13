package Command;

public class TurnOffFan implements Command {

	Fan fan;
	public TurnOffFan(Fan fan) {
		// TODO Auto-generated constructor stub
		this.fan=fan;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		fan.turnOff();
	}

}
