/**
 * GuitarSpec.java
 * 26-Feb-2014 : 10:20:32 pm
 * 
 */
package head.first.OOAD.chapter01.RicksGuitarV03;

/**
 * @author ubuntu
 * @packageName = head.first.OOAD.chapter01.RicksGuitarV03:GuitarSpec.java
 * @createdOn: 26-Feb-2014 : 10:20:32 pm
 * 
 * This is a file for my practice and notes of "Head First
 * OOAD, 1nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://www.headfirstlabs.com/books/hfooad/)
 */
public class GuitarSpec {
	private Builder builder; 
	private String model;
	private Type type;
	private Wood backWood;
	private Wood topWood;
	/**
	 * @param builder
	 * @param model
	 * @param type
	 * @param backWood
	 * @param topWood
	 */
	public GuitarSpec(Builder builder, String model, Type type, Wood backWood,
			Wood topWood) {
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
	}
	/**
	 * @return the builder
	 */
	public Builder getBuilder() {
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
