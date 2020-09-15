package Builder;

public class RobotEngineer {

    private RobotBuilder robotBuilder;

    public RobotEngineer(RobotBuilder rObotBuilder){
        this.robotBuilder = rObotBuilder;
    }


    public Robot getRobot(){
       return this.robotBuilder.getRobot();
    }

    public void makeRobot(){
        this.robotBuilder.buildRobotArms();
        this.robotBuilder.buildRobotHead();
        this.robotBuilder.buildRobotLegs();
        this.robotBuilder.buildRobotTorso();
    }


}
