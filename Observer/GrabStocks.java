package Observer;

public class GrabStocks {

    public static void main(String args[]){

        StockGrabber stockGrabber = new StockGrabber();
        Observer observer1 = new StockObserver(stockGrabber);


        stockGrabber.setAaplPrice(198.00);
        stockGrabber.setMsftPrice(278.00);
        stockGrabber.setTslaPrice(420.00);

    }
}
