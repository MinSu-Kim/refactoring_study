package refactoring_study.replace_error_code_with_exception;

import java.util.HashMap;
import java.util.Map;

public abstract class Command {
	public static final Command FORWARD = new Command("forward") {
		@Override
		public void execute(Robot robot) {
			robot.forward();			
		}
	};
	
    public static final Command BACKWARD = new Command("backward") {
		@Override
		public void execute(Robot robot) {
			robot.backward();
		}
	};
	
    public static final Command TURN_RIGHT = new Command("right") {
    	@Override
		public void execute(Robot robot) {
			robot.right();
		}
    };
    
    public static final Command TURN_LEFT = new Command("left") {
    	@Override
		public void execute(Robot robot) {
			robot.left();
		}
    };
    
  
    public abstract void execute(Robot robot);
    
    private final String name;
    
    protected Command(String name) {
        this.name = name;
    }
    
    private static final Map<String, Command> commandNameMap = new HashMap<String, Command>();
    static {
        commandNameMap.put(FORWARD.name, FORWARD);
        commandNameMap.put(BACKWARD.name, BACKWARD);
        commandNameMap.put(TURN_RIGHT.name, TURN_RIGHT);
        commandNameMap.put(TURN_LEFT.name, TURN_LEFT);
    }

    public String getName() {
        return name;
    }
    public static Command parseCommand(String name) throws InvalidCommandException {
        if (!commandNameMap.containsKey(name)) {
            throw new InvalidCommandException(name);
        }
        return commandNameMap.get(name);
    }

}
