/**
 * Wood.java
 * 26-Feb-2014 : 10:00:19 pm
 * 
 */
package head.first.OOAD.chapter01.RicksGuitarV02;

/**
 * @author ubuntu
 * @packageName = head.first.OOAD.chapter01.RicksGuitarV02:Wood.java
 * @createdOn: 26-Feb-2014 : 10:00:19 pm
 * 
 * This is a file for my practice and notes of "Head First
 * OOAD, 1nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://www.headfirstlabs.com/books/hfooad/)
 */
public enum Wood {
	INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, MAHOGANY, MAPLE,
	COCOBOLO, CEDAR, ADIRONDACK, ALDER, SITKA;
	
	public String toString() {
	    switch(this) {
	      case INDIAN_ROSEWOOD:    return "Indian Rosewood";
	      case BRAZILIAN_ROSEWOOD: return "Brazilian Rosewood";
	      case MAHOGANY:           return "Mahogany";
	      case MAPLE:              return "Maple";
	      case COCOBOLO:           return "Cocobolo";
	      case CEDAR:              return "Cedar";
	      case ADIRONDACK:         return "Adirondack";
	      case ALDER:              return "Alder";
	      case SITKA:              return "Sitka";
	      default:  return "unspecified";
	    }
	  }
}
