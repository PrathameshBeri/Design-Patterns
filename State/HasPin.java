package State;

public class HasPin implements ATMState {

    ATMMachine atmMachine;

    public HasPin(ATMMachine atmMachine){
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
        if(cashToWithdraw <= atmMachine.cashInMachine){
            atmMachine.setCashInMachine(atmMachine.cashInMachine - cashToWithdraw);
            System.out.println("Cash withdrawn, card ejected");
            atmMachine.setAtmState(atmMachine.getNoCardState());
            if(atmMachine.cashInMachine < 0 ){
                atmMachine.setAtmState(atmMachine.atmOutOfMoney);
            }
        }else{
            System.out.println("Not that much cash in the machine");
            System.out.println("Card ejected");
            atmMachine.setAtmState(atmMachine.getNoCashState());
        }

    }
}
