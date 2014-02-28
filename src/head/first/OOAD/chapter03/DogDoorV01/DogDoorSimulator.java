/**
 * DogDoorSimulator.java
 * 26-Feb-2014 : 11:49:40 pm
 * 
 */
package head.first.OOAD.chapter03.DogDoorV01;

/**
 * @author ubuntu
 * @packageName = head.first.OOAD.chapter02.DogDoorV01:DogDoorSimulator.java
 * @createdOn: 26-Feb-2014 : 11:49:40 pm
 * 
 * This is a file for my practice and notes of "Head First
 * OOAD, 1nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://www.headfirstlabs.com/books/hfooad/)
 */
public class DogDoorSimulator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DogDoor door = new DogDoor();
		Remote remote = new Remote(door);
		
		System.out.println("Fido barks to go outside...");
		remote.pressButton();
		
		System.out.println("\nFido has gone outside...");		
		System.out.println("\nFido's all done...");
		
		try {
	      Thread.currentThread().sleep(10000);
	    } catch (InterruptedException e) { }
		System.out.println("...but he's stuck outside!");
		System.out.println("\nFido starts barking...");
		System.out.println("...so Gina grabs the remote control.");
		remote.pressButton();
		
		System.out.println("\nFido's back inside...");
	}

}
