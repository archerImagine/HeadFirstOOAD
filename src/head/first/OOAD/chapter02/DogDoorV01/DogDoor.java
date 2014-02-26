/**
 * DogDoor.java
 * 26-Feb-2014 : 11:45:28 pm
 * 
 */
package head.first.OOAD.chapter02.DogDoorV01;

/**
 * @author ubuntu
 * @packageName = head.first.OOAD.chapter02.DogDoorV01:DogDoor.java
 * @createdOn: 26-Feb-2014 : 11:45:28 pm
 * 
 * This is a file for my practice and notes of "Head First
 * OOAD, 1nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://www.headfirstlabs.com/books/hfooad/)
 */
public class DogDoor {
	private boolean open;

	/**
	 * @param open
	 */
	public DogDoor(boolean open) {
		this.open = open;
	}
	
	public DogDoor(){
		this(false);
	}
	
	public void open() {
		System.out.println("The dog door opens.");
		open = true;
	}
	
	public void close() {
		System.out.println("The dog door closes.");
		open = false;
	}
	
	public boolean isOpen() {
		return open;
	}

}
