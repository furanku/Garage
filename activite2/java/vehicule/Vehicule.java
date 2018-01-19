package it.activite2.java.vehicule;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import it.activite2.java.enumeration.Marque;
import it.activite2.java.gadget.Option;
import it.activite2.java.moteur.Moteur;
import it.activite2.java.moteur.MoteurDiesel;
import it.activite2.java.moteur.MoteurElectrique;
import it.activite2.java.moteur.MoteurEssence;
import it.activite2.java.moteur.MoteurHybride;
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
public class Vehicule implements Serializable{
	/**
	 * Serialization and creation of a serial UID
	 * it could help check for new update
	 */
	private static final long serialVersionUID = -2001879061216243703L;
	
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
	private	 List<Option> options=new ArrayList<>();
	
	/**
	 * mark of this car 
	 * @see Marque
	 */
	private Marque nomMarque;
	
	/**
	 * getter 
	 * @return nom
	 */
	public String getNom() {
		this.nom = getClass().getSimpleName();
		return this.nom;
	}
	
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
		this.options.add(opt);
	}
	
	/**
	 * getter 
	 * @return the mark of this car 
	 */
	public Marque getMarque() {
		return nomMarque;
		}
	
	/**
	 * getter
	 * @return options
	 */
	public String getOptions() {
		String affiche = "";
	
		for(int i=0;i<options.size();i++) {
			if(i+1 == options.size()) {
				affiche += options.get(i).toString();
			}
			else {
				affiche += options.get(i).toString() + ", ";
			}
		}
		return affiche;
	}
	
	/**
	 * getter
	 * @return price
	 */
	public double getPrix() {
		for(int i=0;i<options.size();i++) {
		prix+=options.get(i).getPrix();
		}
		prix+=moteur.getPrix();
		return prix;
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
	 * @see MoteurDiesel
	 * @see MoteurHybride
	 * @see MoteurElectrique
	 * @see MoteurEssence
	 */
	public Moteur getMoteur() {
		return moteur;
	}
	/**
	 * this method describe the car with all the options
	 * @see Marque
	 * @see Moteur#toString()
	 * @see Vehicule#getOptions()
	 */
	@Override
	public String toString() {
		return  getMarque() 
				+ " : " 
				+ getNom() 
				+ moteur.toString() 
				+ "[" 
				+ getOptions()
				+ "] "  ;
	}
	
}

