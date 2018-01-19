package it.activite2.java.gadget;

import java.io.Serializable;

/**
 * <p>Option air conditioner that can be added to a car 
 * This option implements the interface Option
 * and overrides his method getPrix </p>
 * 
 * @see Option#getPrix()
 * @author furanku
 *
 */
public class Climatisation implements Option, Serializable{
	
	private static final long serialVersionUID = 1L;
	/**
	 * to set and get the name of this option
	 * @return Climatisation
	 */
	@Override
	public String toString() {
		return "Climatisation" +"("+ getPrix()+"€)";
	}
	
	/**
	 * This method overrides the method of the interface option
	 * @see Option#getPrix()
	 * @return the price of this option
	 */
	@Override
	public  double getPrix() {
		return 220.0d;
	}

}
