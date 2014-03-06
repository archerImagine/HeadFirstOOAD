/**
 * BarkRecognizer.java
 * 06-Mar-2014 : 11:06:38 pm
 * 
 */
package head.first.OOAD.chapter04.DogDoorV04;

import java.util.Iterator;
import java.util.List;

/**
 * @author ubuntu
 * @packageName = head.first.OOAD.chapter04.DogDoorV04:BarkRecognizer.java
 * @createdOn: 06-Mar-2014 : 11:06:38 pm
 * 
 * This is a file for my practice and notes of "Head First
 * OOAD, 1nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://www.headfirstlabs.com/books/hfooad/)
 */
public class BarkRecognizer {
	private DogDoor door;
	
	public BarkRecognizer(DogDoor door) {
	    this.door = door;
	}
	
	public void recognize(Bark bark) {
	    System.out.println("   BarkRecognizer: Heard a '" +
	        bark.getSound() + "'");
	    List allowedBarks = door.getAllowedBarks();
	    for (Iterator i = allowedBarks.iterator(); i.hasNext(); ) {
	      Bark allowedBark = (Bark)i.next();
	      if (allowedBark.equals(bark)) {
	        door.open();
	        return;
	      }
	    } 
	    System.out.println("This dog is not allowed.");
	}

}
