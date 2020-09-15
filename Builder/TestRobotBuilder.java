package Builder;

public class TestRobotBuilder {
    public static void main(String args[]){

        RobotBuilder oldStyleRobot = new OldRobotBuilder();
        RobotEngineer engineer = new RobotEngineer(oldStyleRobot);
        engineer.makeRobot();

       Robot robot = engineer.getRobot();

        System.out.println(robot.getRobotArms());
        System.out.println(robot.getRobotHead());
        System.out.println(robot.getRobotLegs());
        System.out.println(robot.getRobotTorso());

    }
}
