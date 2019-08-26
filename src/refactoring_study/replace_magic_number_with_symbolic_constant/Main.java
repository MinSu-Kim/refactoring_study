package refactoring_study.replace_magic_number_with_symbolic_constant;

public class Main {

	public static void main(String[] args) {
        System.out.println("beforeMain()");
        Robot robot = new Robot("Andrew");
        robot.order(0); // walk
        robot.order(1); // stop
        robot.order(2); // jump
	}

}
