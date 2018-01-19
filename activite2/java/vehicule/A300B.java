package it.activite2.java.vehicule;

import java.io.Serializable;

import it.activite2.java.enumeration.Marque;

/**
 * this class inherit from Vehicule
 * @see Vehicule
 * @author furanku
 *
 */
public class A300B extends Vehicule implements Serializable {
	
	private static final long serialVersionUID = 3398303102590095912L;

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
