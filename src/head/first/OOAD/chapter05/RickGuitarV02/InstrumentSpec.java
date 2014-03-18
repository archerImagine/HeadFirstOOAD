/**
 * InstrumentSpec.java
 * 18-Mar-2014 : 10:12:03 pm
 * 
 */
package head.first.OOAD.chapter05.RickGuitarV02;

/**
 * @author ubuntu
 * @packageName = head.first.OOAD.chapter05.RickGuitarV02:InstrumentSpec.java
 * @createdOn: 18-Mar-2014 : 10:12:03 pm
 * 
 * This is a file for my practice and notes of "Head First
 * OOAD, 1nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://www.headfirstlabs.com/books/hfooad/)
 */
public abstract class InstrumentSpec {
	private Builder builder; 
	  private String model;
	  private Type type;
	  private Wood backWood;
	  private Wood topWood;

	  public InstrumentSpec(Builder builder, String model, Type type,
	                        Wood backWood, Wood topWood) {
	    this.builder = builder;
	    this.model = model;
	    this.type = type;
	    this.backWood = backWood;
	    this.topWood = topWood;
	  }

	  public Builder getBuilder() {
	    return builder;
	  }

	  public String getModel() {
	    return model;
	  }

	  public Type getType() {
	    return type;
	  }

	  public Wood getBackWood() {
	    return backWood;
	  }

	  public Wood getTopWood() {
	    return topWood;
	  }

	  public boolean matches(InstrumentSpec otherSpec) {
	    if (builder != otherSpec.builder)
	      return false;
	    if ((model != null) && (!model.equals("")) &&
	        (!model.equals(otherSpec.model)))
	      return false;
	    if (type != otherSpec.type)
	      return false;
	    if (backWood != otherSpec.backWood)
	      return false;
	    if (topWood != otherSpec.topWood)
	      return false;
	    return true;
	  }
}
