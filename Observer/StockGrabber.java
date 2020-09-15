package Observer;

import java.util.ArrayList;

public class StockGrabber implements Subject{

    private ArrayList<Observer> observers;
    private double tslaPrice;
    private double aaplPrice;
    private double msftPrice;


    @Override
    public void register(Observer o) {
        observers.add(o);

    }

    @Override
    public void deregister(Observer o) {
        int index = observers.indexOf(o) + 1;
        observers.remove(o);
        System.out.println("The observer has been deregistered: " + index);

    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observers){
            observer.update(tslaPrice, aaplPrice, msftPrice);
        }
    }

    public void setTslaPrice(double newTslaPrice){
        this.tslaPrice = newTslaPrice;
        notifyObserver();
    }

    public void setAaplPrice(double newAaplPrice){
        this.aaplPrice = newAaplPrice;
        notifyObserver();
    }

    public void setMsftPrice(double newMsftPrice){
        this.msftPrice = newMsftPrice;
        notifyObserver();
    }
}
