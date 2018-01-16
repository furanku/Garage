package it.activite2.java.moteur;

import it.activite2.java.enumeration.TypeMoteur;

/**
 * This class inherit from the "Moteur" class 
 * @see Moteur 
 * @author furanku
 */

public class MoteurHybride extends Moteur {
	/**
	 * Constructor of this engine type 
	 * @param cylindre
	 * 				  cubic capacity
	 * @param prix
	 * 			  price
	 */

	public MoteurHybride(String cylindre, double prix) {
		super(cylindre, prix);
		type = TypeMoteur.HYBRIDE;
	}

}
