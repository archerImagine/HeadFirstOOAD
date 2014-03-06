/**
 * BarkRecognizer.java
 * 28-Feb-2014 : 10:15:04 pm
 * 
 */
package head.first.OOAD.chapter04.DogDoorV01;

/**
 * @author ubuntu
 * @packageName = head.first.OOAD.chapter03.DogDoorV02:BarkRecognizer.java
 * @createdOn: 28-Feb-2014 : 10:15:04 pm
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
	    System.out.println("   BarkRecognizer: Heard a '" +bark + "'");
	    door.open();
	}
}
