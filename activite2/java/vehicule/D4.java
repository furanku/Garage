package it.activite2.java.vehicule;

import it.activite2.java.enumeration.Marque;

/**
 * this class inherit from Vehicule
 * @see Vehicule
 * @author furanku
 *
 */

public class D4 extends Vehicule {
	/**
	 * setting this mark,each D4 will always have TROEN as mark
	 * @see Vehicule#getMarque()
	 * @see Marque
	 */
	@Override
	public Marque getMarque() {
	
		return Marque.TROEN;
	}

}
