package refactoring_study.replace_type_code_with_state_strategy;

public class StateLogging extends State{
    private static final StateLogging instance = new StateLogging();
    
    public static StateLogging getInstance() {
        return instance;
    }

    private StateLogging() {}

    @Override
    public void start(Logger logger) {
        /* 아무것도 하지 않음 */
    }

    @Override
    public void stop(Logger logger) {
        System.out.println("** STOP LOGGING **");    
        logger.setState(StateStopped.getInstance());
    }

    @Override
    public void log(String info) {
        System.out.println("Logging: " + info);        
    }

	
}