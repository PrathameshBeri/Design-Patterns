package Builder;

public class Robot implements RobotPlan {
    private String robotHead;
    private String robotArms;
    private String robotLegs;
    private String robotTorso;

    public String getRobotHead() {
        return robotHead;
    }

    public String getRobotArms() {
        return robotArms;
    }

    public String getRobotLegs() {
        return robotLegs;
    }

    public String getRobotTorso() {
        return robotTorso;
    }

    @Override
    public void setRobotHead(String head) {
        robotHead = head;
    }

    @Override
    public void setRobotArms(String arms) {
        robotArms = arms;
    }

    @Override
    public void setRobotLegs(String legs) {
        robotLegs = legs;
    }

    @Override
    public void setRobotTorso(String torso) {
        robotTorso = torso;
    }



}
