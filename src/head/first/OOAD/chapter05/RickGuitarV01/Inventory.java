/**
 * Inventory.java
 * 17-Mar-2014 : 11:18:05 pm
 * 
 */
package head.first.OOAD.chapter05.RickGuitarV01;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ubuntu
 * @packageName = head.first.OOAD.chapter05.RickGuitarV01:Inventory.java
 * @createdOn: 17-Mar-2014 : 11:18:05 pm
 * 
 * This is a file for my practice and notes of "Head First
 * OOAD, 1nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://www.headfirstlabs.com/books/hfooad/)
 */
public class Inventory {
	private List guitars;

	  public Inventory() {
	    guitars = new LinkedList();
	  }

	  public void addGuitar(String serialNumber, double price,
	                        GuitarSpec spec) {
	    Guitar guitar = new Guitar(serialNumber, price, spec);
	    guitars.add(guitar);
	  }

	  public Guitar getGuitar(String serialNumber) {
	    for (Iterator i = guitars.iterator(); i.hasNext(); ) {
	      Guitar guitar = (Guitar)i.next();
	      if (guitar.getSerialNumber().equals(serialNumber)) {
	        return guitar;
	      }
	    }
	    return null;
	  }

	  public List search(GuitarSpec searchSpec) {
	    List matchingGuitars = new LinkedList();
	    for (Iterator i = guitars.iterator(); i.hasNext(); ) {
	      Guitar guitar = (Guitar)i.next();
	      if (guitar.getSpec().matches(searchSpec))
	        matchingGuitars.add(guitar);
	    }
	    return matchingGuitars;
	  }

}
