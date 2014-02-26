/**
 * Inventory.java
 * 26-Feb-2014 : 10:06:56 pm
 * 
 */
package head.first.OOAD.chapter01.RicksGuitarV02;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ubuntu
 * @packageName = head.first.OOAD.chapter01.RicksGuitarV02:Inventory.java
 * @createdOn: 26-Feb-2014 : 10:06:56 pm
 * 
 * This is a file for my practice and notes of "Head First
 * OOAD, 1nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://www.headfirstlabs.com/books/hfooad/)
 */
public class Inventory {
	private List guitars;

	/**
	 * @param guitars
	 */
	public Inventory() {
		this.guitars = new LinkedList();
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
	
	public List search(Guitar searchGuitar) {
	    List matchingGuitars = new LinkedList();
	    for (Iterator i = guitars.iterator(); i.hasNext(); ) {
	      Guitar guitar = (Guitar)i.next();
	      // Ignore serial number since that's unique
	      // Ignore price since that's unique
	      if (searchGuitar.getBuilder() != guitar.getBuilder())
	        continue;
	      String model = searchGuitar.getModel().toLowerCase();
	      if ((model != null) && (!model.equals("")) &&
	          (!model.equals(guitar.getModel().toLowerCase())))
	        continue;
	      if (searchGuitar.getType() != guitar.getType())
	        continue;
	      if (searchGuitar.getBackWood() != guitar.getBackWood())
	        continue;
	      if (searchGuitar.getTopWood() != guitar.getTopWood())
	        continue;
	      matchingGuitars.add(guitar);
	    }
	    return matchingGuitars;
	  }
}
