package State;

public class ATMMachine implements GetATMData {

    ATMState hasCard;
    ATMState noCard;
    ATMState hasCorrectPin;
    ATMState atmOutOfMoney;

    ATMState atmState;

    int cashInMachine = 2000;
    boolean correctPinEntered = false;

    public ATMMachine() {
        this.hasCard = new HasCard(this);
        this.noCard = new NoCard(this);
        this.hasCorrectPin = new HasPin(this);
        this.atmOutOfMoney = new NoCash(this);

        this.atmState = noCard;
        if(cashInMachine < 0){
            atmState = atmOutOfMoney;
        }
    }

    void setAtmState(ATMState atmState){
        this.atmState = atmState;

    }

    public void setCashInMachine(int cash){
        this.cashInMachine = cash;
    }

    public void insertCard(){
        this.atmState.insertCard();
    }

    public void ejectCard(){
        this.atmState.ejectCard();
    }

    public void requestCash(int cash){
        this.atmState.requestCash(cash);
    }

    public void insertPin(int pin) {

        this.atmState.insertPin(pin);
    }

    public ATMState getYesCardState(){
        return hasCard;
    }
    public ATMState getNoCardState(){
        return noCard;
    }
    public ATMState getHasPin(){
        return hasCorrectPin;
    }
    public ATMState getNoCashState(){
        return atmOutOfMoney;
    }

    @Override
    public ATMState getATMData() {
        return this.atmState;
    }

    @Override
    public int getCashInMachine() {
        return this.cashInMachine;
    }
}
