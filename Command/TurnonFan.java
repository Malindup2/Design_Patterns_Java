package Command;

public class TurnonFan implements Command {

	Fan fan;
	
	public TurnonFan(Fan fan){
		this.fan=fan;
	}
	@Override
	public void execute() {
		fan.turnOn();
	}

}
