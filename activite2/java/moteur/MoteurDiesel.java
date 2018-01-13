package it.activite2.java.moteur;
/**
 * This class inherit from the "Moteur" class 
 * @see Moteur 
 * @author furanku
 */

public class MoteurDiesel extends Moteur {
	/**
	 * Constructor of this engine type 
	 * @param cylindre
	 * 				  cubic capacity
	 * @param prix
	 * 			  price
	 */

	public MoteurDiesel(String cylindre, double prix) {
		super(cylindre, prix);
	}

}
