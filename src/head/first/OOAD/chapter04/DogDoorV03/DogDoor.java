/**
 * DogDoor.java
 * 06-Mar-2014 : 10:56:15 pm
 * 
 */
package head.first.OOAD.chapter04.DogDoorV03;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author ubuntu
 * @packageName = head.first.OOAD.chapter04.DogDoorV03:DogDoor.java
 * @createdOn: 06-Mar-2014 : 10:56:15 pm
 * 
 * This is a file for my practice and notes of "Head First
 * OOAD, 1nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://www.headfirstlabs.com/books/hfooad/)
 */
public class DogDoor {
	private boolean open;
	private Bark allowedBark;
	
	
	public DogDoor() {
	    this.open = false;
	}
	/**
	 * @return the allowedBark
	 */
	public Bark getAllowedBark() {
		return allowedBark;
	}


	/**
	 * @param allowedBark the allowedBark to set
	 */
	public void setAllowedBark(Bark allowedBark) {
		this.allowedBark = allowedBark;
	}
	
	public void open() {
	    System.out.println("The dog door opens.");
	    open = true;

	    final Timer timer = new Timer();
	    timer.schedule(new TimerTask() {
	      public void run() {
	        close();
	        timer.cancel();
	      }
	    }, 5000);
	  }

	  public void close() {
	    System.out.println("The dog door closes.");
	    open = false;
	  }

	  public boolean isOpen() {
	    return open;                      
	  }

}
