package it.activite2.java.moteur;
/**
 * This class inherit from the "Moteur" class 
 * @see Moteur 
 * @author furanku
 */

public class MoteurEssence extends Moteur {
	/**
	 * Constructor of this engine type 
	 * @param cylindre
	 * 				  cubic capacity
	 * @param prix
	 * 			  price
	 */

	public MoteurEssence(String cylindre, double prix) {
		super(cylindre, prix);
	}

}