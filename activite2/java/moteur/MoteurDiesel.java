package it.activite2.java.moteur;

import java.io.Serializable;

import it.activite2.java.enumeration.TypeMoteur;

/**
 * This class inherit from the "Moteur" class 
 * @see Moteur 
 * @author furanku
 */

public class MoteurDiesel extends Moteur implements Serializable {
	
	private static final long serialVersionUID = 1877589808661719579L;

	/**
	 * Constructor of this engine type 
	 * @param cylindre
	 * 				  cubic capacity
	 * @param prix
	 * 			  price
	 */
	public MoteurDiesel(String cylindre, double prix) {
		super(cylindre, prix);
		type = TypeMoteur.DIESEL;
	}

}
