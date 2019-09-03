package refactoring_study.replace_error_code_with_exception;

@SuppressWarnings("serial")
public class InvalidCommandException extends Exception {

	public InvalidCommandException() {
	}

	public InvalidCommandException(String message) {
		super(message);
	}

}
