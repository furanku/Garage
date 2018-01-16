package it.activite2.java.vehicule;

import it.activite2.java.enumeration.Marque;

/**
 * this class inherit from Vehicule
 * @see Vehicule
 * @author furanku
 *
 */
public class A300B extends Vehicule {
	/**
	 * setting this mark,each A300B will always have PIGEOT as mark
	 * @see Vehicule#getMarque()
	 * @see Marque
	 */
	@Override
	public Marque getMarque() {
	
		return Marque.PIGEOT;
	}

}
