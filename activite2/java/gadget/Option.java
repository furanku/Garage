package it.activite2.java.gadget;
/**
 * To implements to the different options of the car 
 * @author furanku
 *
 */

public interface Option {
	/**
	 * this methods is abstract must be override
	 * @see BarreDeToit#getPrix()
	 * @see Climatisation#getPrix()
	 * @see GPS#getPrix()
	 * @see VitreElectrique#getPrix()
	 * @see SiegeChauffant#getPrix()	
	 *  
	 * @return nothing 
	 */
	public double getPrix();//to get the price of each added option
	
	public  String toString();//to get the price of each added option

}
