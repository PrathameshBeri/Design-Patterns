package Builder;

public class OldRobotBuilder implements RobotBuilder{

    private Robot robot;

    OldRobotBuilder(){
        this.robot = new Robot();
    }

    @Override
    public void buildRobotHead() {

        robot.setRobotHead("Tin head");

    }

    @Override
    public void buildRobotLegs() {
        robot.setRobotLegs("Tin legs");
    }

    @Override
    public void buildRobotArms() {
        robot.setRobotArms("Tin arms");
    }

    @Override
    public void buildRobotTorso() {
        robot.setRobotTorso("Tin Torso");
    }

    @Override
    public Robot getRobot() {
        return this.robot;
    }


}
