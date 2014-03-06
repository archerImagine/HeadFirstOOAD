/**
 * BarkRecognizer.java
 * 06-Mar-2014 : 10:48:57 pm
 * 
 */
package head.first.OOAD.chapter04.DogDoorV02;

/**
 * @author ubuntu
 * @packageName = head.first.OOAD.chapter04.DogDoorV02:BarkRecognizer.java
 * @createdOn: 06-Mar-2014 : 10:48:57 pm
 * 
 * This is a file for my practice and notes of "Head First
 * OOAD, 1nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://www.headfirstlabs.com/books/hfooad/)
 */
public class BarkRecognizer {
	private DogDoor door;

	/**
	 * @param door
	 */
	public BarkRecognizer(DogDoor door) {
		this.door = door;
	}
	
	public void recognize(String bark) {
	    System.out.println("   BarkRecognizer: Heard a '" +
	        bark + "'");
	    if (door.getAllowedBark().equals(bark)) {
	      door.open();
	    } else {
	      System.out.println("This dog is not allowed.");
	    }
	  }

}
