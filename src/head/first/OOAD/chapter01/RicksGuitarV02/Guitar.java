/**
 * Guitar.java
 * 26-Feb-2014 : 10:03:08 pm
 * 
 */
package head.first.OOAD.chapter01.RicksGuitarV02;

/**
 * @author ubuntu
 * @packageName = head.first.OOAD.chapter01.RicksGuitarV02:Guitar.java
 * @createdOn: 26-Feb-2014 : 10:03:08 pm
 * 
 * This is a file for my practice and notes of "Head First
 * OOAD, 1nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://www.headfirstlabs.com/books/hfooad/)
 */
public class Guitar {
	private String serialNumber, model;
	private double price;
	private Builder builder;
	private Type type;
	private Wood backWood, topWood;
	/**
	 * @param serialNumber
	 * @param price
	 * @param builder
	 * @param model
	 * @param type
	 * @param backWood
	 * @param topWood
	 */
	public Guitar(String serialNumber, double price, Builder builder,
			String model, Type type, Wood backWood, Wood topWood) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
	}
	/**
	 * @return the serialNumber
	 */
	public String getSerialNumber() {
		return serialNumber;
	}
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @return the builder
	 */
	public Builder getBuilder() {
		return builder;
	}
	/**
	 * @return the type
	 */
	public Type getType() {
		return type;
	}
	/**
	 * @return the backWood
	 */
	public Wood getBackWood() {
		return backWood;
	}
	/**
	 * @return the topWood
	 */
	public Wood getTopWood() {
		return topWood;
	}
	
	

}
