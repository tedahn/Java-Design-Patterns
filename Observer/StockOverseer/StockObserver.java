package StockOverseer;

public class StockObserver implements Observer {

	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;
	private static int observerIDTracker = 0;
	
	private int observerId;
	
	private Subject stockGrabber;
	
	public StockObserver(Subject stockGrabber) {
		this.stockGrabber = stockGrabber;
		this.observerId = ++observerIDTracker;
		
		System.out.println("New Observer " +this.observerId);
		
		stockGrabber.register(this);
		
	}
	
	@Override
	public void update(double ibmPrice, double aaplPrice, double googPrice) {
		this.ibmPrice = ibmPrice;
		this.aaplPrice = aaplPrice;
		this.googPrice = googPrice;
		
		printThePrices();
	}

	public void printThePrices() {
		System.out.println(observerId + "\nIBM: "+ibmPrice + 
				"\nAAPL: "+aaplPrice+"\nGOOG: " +googPrice);
	}
	
	public Subject getStockGrabber() {
		return stockGrabber;
	}
}
