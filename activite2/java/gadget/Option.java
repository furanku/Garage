package it.activite2.java.gadget;
/**
 * To implements to the different options of the car 
 * @author furanku
 *
 */

public interface Option {
	/**
	 * this method is abstract must be override
	 * @see BarreDeToit#getPrix()
	 * @see Climatisation#getPrix()
	 * @see GPS#getPrix()
	 * @see VitreElectrique#getPrix()
	 * @see SiegeChauffant#getPrix()	
	 *  
	 * @return nothing 
	 */
	public double getPrix();
}
