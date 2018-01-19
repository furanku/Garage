package it.activite2.java.vehicule;

import java.io.Serializable;

import it.activite2.java.enumeration.Marque;

/**
 * this class inherit from Vehicule
 * @see Vehicule
 * @author furanku
 *
 */

public class D4 extends Vehicule implements Serializable{
	
	private static final long serialVersionUID = -7009516516237005350L;

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
