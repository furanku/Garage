package it.activite2.java.gadget;
/**
 * <p>Option warming seat that can be added to a car 
 * This option implements the interface Option
 * and overrides his method getPrix </p>
 * 
 * @see Option#getPrix()
 * @author furanku
 */

public class SiegeChauffant implements Option {
	/**
	 * Price of this option
	 */
	private double prix;
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
