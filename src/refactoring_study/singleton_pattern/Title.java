package refactoring_study.singleton_pattern;

public class Title {
	private static final Title instance = new Title();

	public static Title getInstance() {
		return instance;
	}

	private Title() {}

}
