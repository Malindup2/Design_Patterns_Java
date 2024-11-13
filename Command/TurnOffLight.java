package Command;

public class TurnOffLight implements Command{
	Light light;
	public TurnOffLight(Light light) {
		// TODO Auto-generated constructor stub
		this.light=light;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		light.turnOff();
	}

}
