package it.activite2.java.vehicule;

import java.io.Serializable;

import it.activite2.java.enumeration.Marque;

/**
 * this class inherit from Vehicule
 * @see Vehicule
 * @author furanku
 *
 */
public class Lagouna extends Vehicule implements Serializable {
	
	private static final long serialVersionUID = 6539011154082270956L;

	/**
	 * setting this mark,each A300B will always have RENO as mark 
	 * @see Vehicule#getMarque()
	 * @see Marque
	 */
	@Override
	public Marque getMarque() {
	
		return Marque.RENO;
	}
}
