package Command;

public class MainApp {
	public static void main(String[] args) {
		Light light=new Light()	;
		Fan fan=new Fan();
		
		Remote remote=new Remote();
		
		Command lightOn =new TurnOnLight(light);
		remote.pressbtn(lightOn);
		
		Command lightOff =new TurnOffLight(light);
		remote.pressbtn(lightOff);
		
		
	
	}
}
