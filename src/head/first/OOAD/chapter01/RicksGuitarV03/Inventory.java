/**
 * Inventory.java
 * 26-Feb-2014 : 10:23:19 pm
 * 
 */
package head.first.OOAD.chapter01.RicksGuitarV03;

import head.first.OOAD.chapter01.RicksGuitarV03.Builder;
import head.first.OOAD.chapter01.RicksGuitarV03.Guitar;
import head.first.OOAD.chapter01.RicksGuitarV03.Type;
import head.first.OOAD.chapter01.RicksGuitarV03.Wood;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ubuntu
 * @packageName = head.first.OOAD.chapter01.RicksGuitarV03:Inventory.java
 * @createdOn: 26-Feb-2014 : 10:23:19 pm
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
						Builder builder, String model,
						Type type, Wood backWood, Wood topWood) {
		Guitar guitar = new Guitar(serialNumber, price, builder,
		model, type, backWood, topWood);
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
	      GuitarSpec guitarSpec = guitar.getSpec();
	      if (searchSpec.getBuilder() != guitarSpec.getBuilder())
	        continue;
	      String model = searchSpec.getModel().toLowerCase();
	      if ((model != null) && (!model.equals("")) &&
	          (!model.equals(guitarSpec.getModel().toLowerCase())))
	        continue;
	      if (searchSpec.getType() != guitarSpec.getType())
	        continue;
	      if (searchSpec.getBackWood() != guitarSpec.getBackWood())
	        continue;
	      if (searchSpec.getTopWood() != guitarSpec.getTopWood())
	        continue;
	      matchingGuitars.add(guitar);
	    }
	    return matchingGuitars;
	  }
}
