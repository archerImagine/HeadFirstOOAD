/**
 * Instrument.java
 * 18-Mar-2014 : 10:21:20 pm
 * 
 */
package head.first.OOAD.chapter05.RickGuitarV03;

/**
 * @author ubuntu
 * @packageName = head.first.OOAD.chapter05.RickGuitarV03:Instrument.java
 * @createdOn: 18-Mar-2014 : 10:21:20 pm
 * 
 * This is a file for my practice and notes of "Head First
 * OOAD, 1nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://www.headfirstlabs.com/books/hfooad/)
 */
public class Instrument {
	private String serialNumber;
	  private double price;
	  private InstrumentSpec spec;

	  public Instrument(String serialNumber, double price, InstrumentSpec spec) {
	    this.serialNumber = serialNumber;
	    this.price = price;
	    this.spec = spec;
	  }

	  public String getSerialNumber() {
	    return serialNumber;
	  }

	  public double getPrice() {
	    return price;
	  }

	  public void setPrice(float newPrice) {
	    this.price = newPrice;
	  }

	  public InstrumentSpec getSpec() {
	    return spec;
	  }  
}
