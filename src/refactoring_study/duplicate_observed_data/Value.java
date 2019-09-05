package refactoring_study.duplicate_observed_data;

import java.util.ArrayList;
import java.util.List;

public class Value {
	private final List<ValueListener> listeners;

	private int value;

	public Value(int value) {
		this.value = value;
		this.listeners = new ArrayList<>();
	}

	public void addValueListener(ValueListener listener) {
		this.listeners.add(listener);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
		notifyToListener();
	}

	private void notifyToListener() {
		for(ValueListener listener : listeners) {
            listener.valueChanger(new ValueChangeEvent(this));
        }		
	}
}


