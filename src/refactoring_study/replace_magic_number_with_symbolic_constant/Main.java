package refactoring_study.replace_magic_number_with_symbolic_constant;

public class Main {

	public static void main(String[] args) {
        System.out.println("afterMain()");
        Robot robot = new Robot("Andrew");
        robot.order(Robot.COMMAND_WALK); // walk
        robot.order(Robot.COMMAND_STOP); // stop
        robot.order(Robot.COMMAND_JUMP); // jump
	}

}
