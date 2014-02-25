/**
 * Guitar.java
 * 22-Feb-2014 : 11:13:26 pm
 * 
 */
package head.first.OOAD.chapter01.RicksGuitarV01;

/**
 * @author ubuntu
 * @packageName = head.first.OOAD.chapter01.RicksGuitarV01:Guitar.java
 * @createdOn: 22-Feb-2014 : 11:13:26 pm
 * 
 * This is a file for my practice and notes of "Head First
 * OOAD, 1nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://www.headfirstlabs.com/books/hfooad/)
 */
public class Guitar {
	private String serialNumber, builder, model, type, backWood, topWood;
	private double price;
	
	public Guitar(String serialNumber,
				double price,
				String builder,
				String model,
				String type,
				String backWood,
				String topWood){
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
	 * @return the builder
	 */
	public String getBuilder() {
		return builder;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @return the backWood
	 */
	public String getBackWood() {
		return backWood;
	}

	/**
	 * @return the topWood
	 */
	public String getTopWood() {
		return topWood;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	
	

}
