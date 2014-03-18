/**
 * Style.java
 * 18-Mar-2014 : 10:13:55 pm
 * 
 */
package head.first.OOAD.chapter05.RickGuitarV03;

/**
 * @author ubuntu
 * @packageName = head.first.OOAD.chapter05.RickGuitarV02:Style.java
 * @createdOn: 18-Mar-2014 : 10:13:55 pm
 * 
 * This is a file for my practice and notes of "Head First
 * OOAD, 1nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://www.headfirstlabs.com/books/hfooad/)
 */
public enum Style {
	A, F;

	  public String toString() {
	    switch(this) {
	      case A:   return "A style";
	      case F:   return "F style";
	      default:  return "Unspecified";
	    }
	  }
}
