package State;

public class NoCard implements ATMState {

    ATMMachine atmMachine;

    public NoCard(ATMMachine atmMachine){
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Please enter your card to continue");
        atmMachine.setAtmState(atmMachine.getYesCardState());

    }

    @Override
    public void ejectCard() {
        System.out.println("No card currently in machine");

    }

    @Override
    public void insertPin(int pinEntered) {

        System.out.println("Please enter your card to login");

    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("Enter card and credentials first!");

    }
}
