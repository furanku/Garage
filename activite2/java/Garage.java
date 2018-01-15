package it.activite2.java;

import java.io.File;
import java.util.List;

import it.activite2.java.vehicule.Vehicule;
/**
 * class garage to add and store each created car
 * @author furanku
 *
 */
public class Garage {
	List<Vehicule> voitures;
	File garage = new File("garage.txt");
	
	
	
	public void addVoiture(Vehicule voit) {
		
	}
	
	@Override
	public String toString() {
		return "Aucune voiture sauvegardéé !\n"
				+ "***************************\n"
				+"*  Garage OpenClassrooms  *\n"
				+ "***************************";
	}
	
	
	

}
