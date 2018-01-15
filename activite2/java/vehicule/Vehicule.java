package it.activite2.java.vehicule;

import java.util.List;

import it.activite2.java.enumeration.Marque;
import it.activite2.java.gadget.Option;
import it.activite2.java.moteur.Moteur;
/**
 * Vehicule is the class which represents the car 
 * Each car is characterized by
 * <ul>
 * <li>this car price</li>
 * <li>this name of that car </li>
 * <li>this list of the options that can be added to that car 
 *      one car can have all the options available</li>
 * <li>this car mark</li>
 * <li>this car engine</li>
 * </ul>
 * 
 * @version 1.0
 * @author furanku
 *
 */
public class Vehicule {
	/**
	 * Price of this car
	 */
	private double prix;
	/**
	 * name of this car
	 */
	private String nom;
	/**
	 * list of all the options 
	 * @see Option
	 */
	private	 List<Option> options;
	/**
	 * mark of this car 
	 * @see Marque
	 */
	private Marque nomMarque;
	/**
	 * type of this engine
	 * @see Moteur
	 */
	private Moteur moteur;
		
	/**
	 * Method to add an option to the car 
	 * @param opt
	 * 			 option of this car
	 */
	public void addOption(Option opt) {
		opt.getPrix();
	}
	
	/**
	 * getter 
	 * @return the mark of this car 
	 */
	public Marque getMarque() {
		return nomMarque;
		
		}
	/**
	 * setter 
	 * @param nomMarque
	 * 				   mark of this car 
	 */
	public void setMarque(Marque nomMarque) {
		this.nomMarque = nomMarque;
	}
	/**
	 * getter
	 * @return options
	 */
	public List<Option> getOptions() {
		return options;
	}
	/**
	 * setter
	 * @param opt
	 * 			 option of this car 
	 */
	public void setOption(List<Option> opt) {
		this.options =  opt;
	}
	/**
	 * getter
	 * @return price
	 */
	public double getPrix() {
		return prix;
	}
	/**
	 * setter
	 * @param prix
	 * 			  price
	 */
	public void setPrix(double prix) {
		this.prix = prix;
	}
	/**
	 * setter 
	 * @param moteur
	 * 				engine of this car
	 */
	public void setMoteur(Moteur moteur) {
		this.moteur = moteur;
	}
	/**
	 * getter
	 * @return engine 
	 */
	public Moteur getMoteur() {
		return moteur;
	}
	
	public String toString() {
		return "";
	}

}

