package it.activite2.java;

import java.io.BufferedInputStream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import it.activite2.java.vehicule.Vehicule;

/**
 * class garage to add and store each created car
 * @author Furanku
 */
public class Garage {
	private List<Vehicule> voitures ;
	private String file = "garage.txt";
	ObjectInputStream ois;
	ObjectOutputStream oos;

	/**
	 * constructor of the class 
	 * the file where we will store each new car is created here 
	 */
	@SuppressWarnings("unchecked")
	public Garage() {
		 voitures = new ArrayList<>();//Instantiation of a new ArrayList
			//catching the exceptions if the file doesn't exist
			try {
				ois = new ObjectInputStream(
						new BufferedInputStream(
							new FileInputStream(
									new File(file))));
				this.voitures = (List<Vehicule>) ois.readObject(); //reading the file if it exists 
				ois.close();
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
			}catch(FileNotFoundException e) {
				System.err.println("Aucune voiture sauvegardée !");//print this if the file doesn't exist 
				try {
					Thread.sleep(10);//as syserr is sometimes faster than sysout i make it sleeps for 10ms to always have a good output 
				} catch (InterruptedException ie) {
					ie.printStackTrace();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
	}
	/**
	 * this method add each new car with all the options
	 * in this method we will also save each car in the file 
	 * @param voiture
	 * 			 	 this car 
	 */
	public void addVoiture(Vehicule voiture) {
			
		 this.voitures.add(voiture);//adding a new car
		try {
				oos = new ObjectOutputStream(
						new BufferedOutputStream(
							new FileOutputStream(
								new File(file))));
				
				oos.writeObject(this.voitures); // writing in the file
				oos.close();	
			}catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	 
	/**
	 * overriding the toString method of the Garage Class
	 * output visualization
	 */
	@Override
	public String toString() {
	   String affichage="";
			   affichage = "***************************\n";
			   affichage += "*  Garage OpenClassrooms  *\n";
		       affichage += "***************************\n";
		       
	   for (Vehicule vehicule : voitures) {
			   affichage += "+ Voiture " 
					   	 +vehicule.toString();
	   }
	   voitures = new ArrayList<>();/*re-initialization of the Arraylist to have the same result after the second try
									  and avoid duplication of the created cars*/
	   return affichage;				
	
	}

}

