package Command;

public class TurnOnLight implements Command{
	Light light;
	public TurnOnLight(Light light) {
		// TODO Auto-generated constructor stub
		this.light=light;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		light.turnOn();
	}

}
