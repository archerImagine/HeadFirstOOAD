/**
 * BarkRecognizer.java
 * 06-Mar-2014 : 11:00:23 pm
 * 
 */
package head.first.OOAD.chapter04.DogDoorV03;

/**
 * @author ubuntu
 * @packageName = head.first.OOAD.chapter04.DogDoorV03:BarkRecognizer.java
 * @createdOn: 06-Mar-2014 : 11:00:23 pm
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
	public void recognize(Bark bark) {
		System.out.println("   BarkRecognizer: Heard a '" +bark.getSound() + "'");
		if (door.getAllowedBark().equals(bark)) {
			door.open();
		}else{
			System.out.println("This dog is not allowed.");
		}
	}

}
