/**
 * Guitar.java
 * 26-Feb-2014 : 10:37:46 pm
 * 
 */
package head.first.OOAD.chapter01.RicksGuitarV04;

/**
 * @author ubuntu
 * @packageName = head.first.OOAD.chapter01.RicksGuitarV04:Guitar.java
 * @createdOn: 26-Feb-2014 : 10:37:46 pm
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

	/**
	 * @return the serialNumber
	 */
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @return the spec
	 */
	public GuitarSpec getSpec() {
		return spec;
	}
	
}
