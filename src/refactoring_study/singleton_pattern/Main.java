package refactoring_study.singleton_pattern;

public class Main {
	public static void main(String[] args) {
		Title t1 = Title.getInstance();
		Title t2 = Title.getInstance();

		System.out.println(t1 + " \n" + t2);
	}
}
