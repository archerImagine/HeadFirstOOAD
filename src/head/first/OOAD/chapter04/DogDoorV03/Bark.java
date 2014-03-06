/**
 * Bark.java
 * 06-Mar-2014 : 10:56:35 pm
 * 
 */
package head.first.OOAD.chapter04.DogDoorV03;

/**
 * @author ubuntu
 * @packageName = head.first.OOAD.chapter04.DogDoorV03:Bark.java
 * @createdOn: 06-Mar-2014 : 10:56:35 pm
 * 
 * This is a file for my practice and notes of "Head First
 * OOAD, 1nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://www.headfirstlabs.com/books/hfooad/)
 */
public class Bark {
	private String sound;

	/**
	 * @param sound
	 */
	public Bark(String sound) {
		this.sound = sound;
	}

	/**
	 * @return the sound
	 */
	public String getSound() {
		return sound;
	}
	public boolean equals(Object bark) {
		if (bark instanceof Bark) {
			Bark otherBark = (Bark)bark;
			if (this.sound.equalsIgnoreCase(otherBark.sound)) {
				return true;
			}
		}
		return false;
	}

}
