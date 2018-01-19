package it.activite2.java.moteur;

import java.io.Serializable;

import it.activite2.java.enumeration.TypeMoteur;

/**
 * This class inherit from the "Moteur" class 
 * @see Moteur 
 * @author furanku
 */

public class MoteurEssence extends Moteur implements Serializable {
	
	private static final long serialVersionUID = -1294047463900958651L;

	/**
	 * Constructor of this engine type 
	 * @param cylindre
	 * 				  cubic capacity
	 * @param prix
	 * 			  price
	 */
	public MoteurEssence(String cylindre, double prix) {
		super(cylindre, prix);
		type = TypeMoteur.ESSENCE;
	}

}
