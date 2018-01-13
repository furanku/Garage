package it.activite2.java.moteur;

import it.activite2.java.enumeration.TypeMoteur;
/**
 * <p>Abstract class of the engine with all his characteristics
 * this class is inherited by another classes to be used </p>
 * 
 * @see MoteurDiesel
 * @see MoteurElectrique
 * @see MoteurEssence
 * @see MoteurHybride
 * <p>
 * An engine is characterized by 
 * <ul>
 * <li>An engine's type </li>
 * <li>A cubic capacity </li>
 * <li>This engine price </li> 
 * </ul>
 * </p>
 * @author furanku
 */
public abstract class Moteur {
	/**
	 * Type of this engine
	 * @see TypeMoteur
	 */
	protected TypeMoteur type;
	/**
	 * cubic capacity of this engine
	 */
	protected String cylindre;
	/**
	 * price of this engine
	 */
	protected double prix;
	/**
	 * Constructor of this engine
	 * @param cylindre
	 * 				  the cubic capacity of this engine
	 * @param prix
	 * 			  the price of this engine
	 */
	public Moteur(String cylindre, double prix) {
		super();
		setCylindre(cylindre);
		setPrix(prix);
	}
	/**
	 * getter of the cubic capacity
	 * @return this engine cubic capacity
	 */
	public String getCylindre() {
		return cylindre;
	}
	/**
	 * setter of the cubic capacity
	 * @param cylindre
	 * 				  cubic capacity
	 */
	public void setCylindre(String cylindre) {
		this.cylindre = cylindre;
	}
	/**
	 * getter of the price
	 * @return price of this engine
	 */
	public double getPrix() {
		return prix;
	}
	/**
	 * setter of the price
	 * @param prix
	 * 			  price 
	 */
	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	/**
	 * This method describe the engine and his characteristics 
	 * type,capacity and price
	 */
	@Override
	public String toString() {
		return "";
	}
}
