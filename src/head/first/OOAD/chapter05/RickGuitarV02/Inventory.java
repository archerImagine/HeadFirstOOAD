/**
 * Inventory.java
 * 18-Mar-2014 : 10:16:58 pm
 * 
 */
package head.first.OOAD.chapter05.RickGuitarV02;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ubuntu
 * @packageName = head.first.OOAD.chapter05.RickGuitarV02:Inventory.java
 * @createdOn: 18-Mar-2014 : 10:16:59 pm
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
	    Instrument instrument = null;
	    if (spec instanceof GuitarSpec) {
	      instrument = new Guitar(serialNumber, price, (GuitarSpec)spec);
	    } else if (spec instanceof MandolinSpec) {
	      instrument = new Mandolin(serialNumber, price, (MandolinSpec)spec);
	    }
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

	  public List search(GuitarSpec searchSpec) {
	    List matchingGuitars = new LinkedList();
	    for (Iterator i = inventory.iterator(); i.hasNext(); ) {
	      Guitar guitar = (Guitar)i.next();
	      if (guitar.getSpec().matches(searchSpec))
	        matchingGuitars.add(guitar);
	    }
	    return matchingGuitars;
	  }

	  public List search(MandolinSpec searchSpec) {
	    List matchingMandolins = new LinkedList();
	    for (Iterator i = inventory.iterator(); i.hasNext(); ) {
	      Mandolin mandolin = (Mandolin)i.next();
	      if (mandolin.getSpec().matches(searchSpec)) 
	        matchingMandolins.add(mandolin);
	    }
	    return matchingMandolins;
	  }

}
