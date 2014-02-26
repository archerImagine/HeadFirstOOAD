/**
 * Builder.java
 * 26-Feb-2014 : 10:02:30 pm
 * 
 */
package head.first.OOAD.chapter01.RicksGuitarV02;

/**
 * @author ubuntu
 * @packageName = head.first.OOAD.chapter01.RicksGuitarV02:Builder.java
 * @createdOn: 26-Feb-2014 : 10:02:30 pm
 * 
 * This is a file for my practice and notes of "Head First
 * OOAD, 1nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://www.headfirstlabs.com/books/hfooad/)
 */
public enum Builder {
	FENDER, MARTIN, GIBSON, COLLINGS, OLSON, RYAN, PRS, ANY;
	
	public String toString() {
	    switch(this) {
	      case FENDER:   return "Fender";
	      case MARTIN:   return "Martin";
	      case GIBSON:   return "Gibson";
	      case COLLINGS: return "Collings";
	      case OLSON:    return "Olson";
	      case RYAN:     return "Ryan";
	      case PRS :     return "PRS";
	      default:       return "Unspecified";
	    }
	  }
}
