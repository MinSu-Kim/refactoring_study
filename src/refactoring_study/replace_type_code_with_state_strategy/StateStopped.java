package refactoring_study.replace_type_code_with_state_strategy;

public class StateStopped extends State{

	@Override
	public int getTypeCode() {
		return Logger.STATE_STOPPED;
	}
	
}