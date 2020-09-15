package State;

public class HasCard implements ATMState {

    ATMMachine atmMachine;

    public HasCard(ATMMachine atmMachine){
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("You cannot enter more than one card");

    }

    @Override
    public void ejectCard() {
        System.out.println("Card ejected");
        atmMachine.setAtmState(atmMachine.getNoCardState());

    }

    @Override
    public void insertPin(int pinEntered) {

        if(pinEntered == 12345) {
            System.out.println("Correct Pin");
            atmMachine.correctPinEntered = true;
            atmMachine.setAtmState(atmMachine.getHasPin());
        }else{
            System.out.println("Wrong Pin Entered");
            atmMachine.correctPinEntered = false;
            System.out.println("Ejecting card");
            atmMachine.setAtmState(atmMachine.getNoCardState());
        }


    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("Enter pin first!");

    }
}
