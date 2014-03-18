/**
 * InstrumentType.java
 * 18-Mar-2014 : 10:22:40 pm
 * 
 */
package head.first.OOAD.chapter05.RickGuitarV03;

/**
 * @author ubuntu
 * @packageName = head.first.OOAD.chapter05.RickGuitarV03:InstrumentType.java
 * @createdOn: 18-Mar-2014 : 10:22:40 pm
 * 
 * This is a file for my practice and notes of "Head First
 * OOAD, 1nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://www.headfirstlabs.com/books/hfooad/)
 */
public enum InstrumentType {
	GUITAR, BANJO, DOBRO, FIDDLE, BASS, MANDOLIN;

	  public String toString() {
	    switch(this) {
	      case GUITAR:   return "Guitar";
	      case BANJO:    return "Banjo";
	      case DOBRO:    return "Dobro";
	      case FIDDLE:   return "Fiddle";
	      case BASS:     return "Bass";
	      case MANDOLIN: return "Mandolin";
	      default:       return "Unspecified";
	    }
	  }
}
