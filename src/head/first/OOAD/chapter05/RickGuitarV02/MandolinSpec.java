/**
 * MandolinSpec.java
 * 18-Mar-2014 : 10:15:55 pm
 * 
 */
package head.first.OOAD.chapter05.RickGuitarV02;

/**
 * @author ubuntu
 * @packageName = head.first.OOAD.chapter05.RickGuitarV02:MandolinSpec.java
 * @createdOn: 18-Mar-2014 : 10:15:55 pm
 * 
 * This is a file for my practice and notes of "Head First
 * OOAD, 1nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://www.headfirstlabs.com/books/hfooad/)
 */
public class MandolinSpec extends InstrumentSpec {
	private Style style;

	  public MandolinSpec(Builder builder, String model, Type type,
	                      Style style, Wood backWood, Wood topWood) {
	    super(builder, model, type, backWood, topWood);
	    this.style = style;
	  }

	  public Style getStyle() {
	    return style;
	  }

	  // Override the superclass matches()
	  public boolean matches(InstrumentSpec otherSpec) {
	    if (!super.matches(otherSpec))
	      return false;
	    if (!(otherSpec instanceof MandolinSpec))
	      return false;
	    MandolinSpec spec = (MandolinSpec)otherSpec;
	    if (!style.equals(spec.style))
	      return false;
	    return true;
	  }
}
