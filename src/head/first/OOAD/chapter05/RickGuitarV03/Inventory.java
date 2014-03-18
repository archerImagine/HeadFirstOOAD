/**
 * Inventory.java

 * 18-Mar-2014 : 10:22:59 pm
 * 
 */

package head.first.OOAD.chapter05.RickGuitarV03;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ubuntu
 * @packageName = head.first.OOAD.chapter05.RickGuitarV03:Inventory.java
 * @createdOn: 18-Mar-2014 : 10:22:59 pm
 * 
 * This is a file for my practice and notes of "Head First
 * OOAD, 1nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://www.headfirstlabs.com/books/hfooad/)
 */
public class Inventory {
	private List inventory;

	  public Inventory() {
	    inventory = new LinkedList();
	  }

	  public void addInstrument(String serialNumber, double price,
	                            InstrumentSpec spec) {
	    Instrument instrument = new Instrument(serialNumber, price, spec);
	    inventory.add(instrument);
	  }

	  public Instrument get(String serialNumber) {
	    for (Iterator i = inventory.iterator(); i.hasNext(); ) {
	      Instrument instrument = (Instrument)i.next();
	      if (instrument.getSerialNumber().equals(serialNumber)) {
	        return instrument;
	      }
	    }
	    return null;
	  }

	  public List search(InstrumentSpec searchSpec) {
	    List matchingInstruments = new LinkedList();
	    for (Iterator i = inventory.iterator(); i.hasNext(); ) {
	      Instrument instrument = (Instrument)i.next();
	      if (instrument.getSpec().matches(searchSpec))
	        matchingInstruments.add(instrument);
	    }
	    return matchingInstruments;
	  }

}
