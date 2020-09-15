package State;

public class TestATMMachine {
    public static void main(String args[]){

        ATMMachine atmMachine = new ATMMachine();

        atmMachine.insertCard();

        atmMachine.ejectCard();

        atmMachine.insertCard();

        atmMachine.insertPin(12345);

        atmMachine.requestCash(2000);

        atmMachine.insertCard();

        atmMachine.insertPin(1234);

        GetATMData realAtmMachine = new ATMMachine();

        GetATMData atmProxy = new ATMProxy();

        System.out.println("Current atm state is " + atmProxy.getATMData());

        System.out.println("Current atm cash is " + atmProxy.getCashInMachine());

    }
}
