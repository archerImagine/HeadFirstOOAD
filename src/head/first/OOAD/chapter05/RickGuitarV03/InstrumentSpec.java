/**
 * InstrumentSpec.java
 * 18-Mar-2014 : 10:21:47 pm
 * 
 */
package head.first.OOAD.chapter05.RickGuitarV03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author ubuntu
 * @packageName = head.first.OOAD.chapter05.RickGuitarV03:InstrumentSpec.java
 * @createdOn: 18-Mar-2014 : 10:21:47 pm
 * 
 * This is a file for my practice and notes of "Head First
 * OOAD, 1nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://www.headfirstlabs.com/books/hfooad/)
 */
public class InstrumentSpec {
	private Map properties;

	  public InstrumentSpec(Map properties) {
	    if (properties == null) {
	      this.properties = new HashMap();
	    } else {
	      this.properties = new HashMap(properties);
	    }
	  }

	  public Object getProperty(String propertyName) {
	    return properties.get(propertyName);
	  }

	  public Map getProperties() {
	    return properties;
	  }

	  public boolean matches(InstrumentSpec otherSpec) {
	    for (Iterator i = otherSpec.getProperties().keySet().iterator(); 
	         i.hasNext(); ) {
	      String propertyName = (String)i.next();
	      if (!properties.get(propertyName).equals(
	           otherSpec.getProperty(propertyName))) {
	        return false;
	      }
	    }
	    return true;
	  }
}
