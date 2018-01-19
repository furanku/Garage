package it.activite2.java.gadget;

import java.io.Serializable;

/**
 * <p>Option roof rack that can be added to a car 
 * This option implements the interface Option
 * and overrides his method getPrix </p>
 * 
 * @see Option#getPrix()
 * @author furanku
 *
 */

public class BarreDeToit implements Option, Serializable{
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * to set and get the name of this option
	 * @return Barre de Toit
	 */
	@Override
	public String toString() {
		return "Barre de Toit" + "("+getPrix()+"€)";
	}
	
	/**
	 * This method overrides the method of the interface option
	 * @see Option#getPrix()
	 * @return the price of this option
	 */
	@Override
	public  double getPrix() {
		return 150.0d;
	}
	
	

}
