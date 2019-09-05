package refactoring_study.duplicate_observed_data;

public class ValueChangeEvent {
	private final Value source;

	public ValueChangeEvent(Value source) {
		this.source = source;
	}

	public Value getSource() {
		return source;
	}
}
