/**
 * Remote.java
 * 26-Feb-2014 : 11:48:38 pm
 * 
 */
package head.first.OOAD.chapter02.DogDoorV03;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author ubuntu
 * @packageName = head.first.OOAD.chapter02.DogDoorV01:Remote.java
 * @createdOn: 26-Feb-2014 : 11:48:38 pm
 * 
 * This is a file for my practice and notes of "Head First
 * OOAD, 1nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://www.headfirstlabs.com/books/hfooad/)
 */
public class Remote {
	private DogDoor door;

	/**
	 * @param door
	 */
	public Remote(DogDoor door) {
		this.door = door;
	}
	public void pressButton() {
		System.out.println("Pressing the remote control button...");
		if (door.isOpen()) {
			door.close();
		}else{
			door.open();
			
			final Timer timer = new Timer();
			timer.schedule(new TimerTask() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					door.close();
					timer.cancel();
					
				}
			}, 5000);
		}
	}
	
	
}
