/**
 * Guitar.java
 * 17-Mar-2014 : 11:16:59 pm
 * 
 */
package head.first.OOAD.chapter05.RickGuitarV01;

/**
 * @author ubuntu
 * @packageName = head.first.OOAD.chapter05.RickGuitarV01:Guitar.java
 * @createdOn: 17-Mar-2014 : 11:16:59 pm
 * 
 * This is a file for my practice and notes of "Head First
 * OOAD, 1nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://www.headfirstlabs.com/books/hfooad/)
 */
public class Guitar {
	private String serialNumber;
	  private double price;
	  GuitarSpec spec;

	  public Guitar(String serialNumber, double price, GuitarSpec spec) {
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

	  public GuitarSpec getSpec() {
	    return spec;
	  }

}
