/**
 * <b>package of all the gadgets that can be added to a car</b>
 */
package it.activite2.java.gadget;
/**
 * <p>Option GPS that can be added to a car 
 * This option implements the interface Option
 * and overrides his method getPrix </p>
 * 
 * @see Option#getPrix()
 * @author furanku
 */

public class GPS implements Option {
	/**
	 * This method overrides the method of the interface option
	 * @see Option#getPrix()
	 * @return the price of this option
	 */
	@Override
	public  double getPrix() {
		return 120.0d;
	}

}
