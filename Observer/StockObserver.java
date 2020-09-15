package Observer;

public class StockObserver implements Observer{

    private double tslaPrice;
    private double aaplPrice;
    private double msftPrice;
    private Subject stockGrabber;
    private int observerId;

    private static int observerIdTracker = 0;

    public StockObserver(Subject stockGrabber){

        this.stockGrabber = stockGrabber;
        this.observerId = ++observerIdTracker;
        System.out.println("New Observer : " + this.observerId);
        stockGrabber.register(this);
    }

    @Override
    public void update(double tslaPrice, double aaplPrice, double msftPrice) {
        this.tslaPrice = tslaPrice;
        this.aaplPrice = aaplPrice;
        this.msftPrice = msftPrice;

        printPrices();
    }

    private void printPrices() {

        System.out.println(observerId + " \n TESLA : " + tslaPrice + " \n Apple: " +
                                aaplPrice + " \n Microsoft: " + msftPrice);
    }


}
