package it.activite2.java.gadget;

import java.io.Serializable;

/**
 * <p>Option warming seat that can be added to a car 
 * This option implements the interface Option
 * and overrides his method getPrix </p>
 * 
 * @see Option#getPrix()
 * @author furanku
 */

public class SiegeChauffant implements Option, Serializable{
	
	private static final long serialVersionUID = 1L;
	/**
	 * to set and get the name of this option
	 * @return Siege Chauffant
	 */
	@Override
	public String toString() {
		return "Siege Chauffant" + "("+getPrix()+"€)";
	}
	
	/**
	 * This method overrides the method of the interface option
	 * @see Option#getPrix()
	 * @return the price of this option
	 */
	@Override
	public double getPrix() {
		
		return 350.0d;
	}

}
