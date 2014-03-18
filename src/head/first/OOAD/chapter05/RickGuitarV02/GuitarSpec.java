/**
 * GuitarSpec.java
 * 18-Mar-2014 : 10:13:26 pm
 * 
 */
package head.first.OOAD.chapter05.RickGuitarV02;

/**
 * @author ubuntu
 * @packageName = head.first.OOAD.chapter05.RickGuitarV02:GuitarSpec.java
 * @createdOn: 18-Mar-2014 : 10:13:26 pm
 * 
 * This is a file for my practice and notes of "Head First
 * OOAD, 1nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://www.headfirstlabs.com/books/hfooad/)
 */
public class GuitarSpec extends InstrumentSpec {
	private int numStrings;

	  public GuitarSpec(Builder builder, String model, Type type,
	                    int numStrings, Wood backWood, Wood topWood) {
	    super(builder, model, type, backWood, topWood);
	    this.numStrings = numStrings;
	  }

	  public int getNumStrings() {
	    return numStrings;
	  }

	  // Override the superclass matches()
	  public boolean matches(InstrumentSpec otherSpec) {
	    if (!super.matches(otherSpec)) 
	      return false;
	    if (!(otherSpec instanceof GuitarSpec))
	      return false;
	    GuitarSpec spec = (GuitarSpec)otherSpec;
	    if (numStrings != spec.numStrings) 
	      return false;
	    return true;
	  }
}
