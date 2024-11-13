package Command;

public class Remote {
	Command command;
	void setCommand(Command command) {
		this.command=command;
	}
	
	void pressbtn(Command command) {
		command.execute();
	}
}
