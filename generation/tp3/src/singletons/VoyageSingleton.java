package singletons;


import java.util.ArrayList;
import java.util.Date;

import model.Location;
import model.Voyage;
import visiteurs.Visiteur;

public class VoyageSingleton {

	private VoyageSingleton singleton;

	public VoyageSingleton getSingleton() {
		return this.singleton;
	}

	public Voyage fabricateVoyage() {
		// TODO - implement VoyageSingleton.fabricateVoyage
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param trajetCode
	 * @param dateHeureDepart
	 * @param dateHeureArrivée
	 * @param destination
	 */
	public void modifier(String trajetCode, Date dateHeureDepart, Date dateHeureArrivée, ArrayList<Location> destination) {
		// TODO - implement VoyageSingleton.modifier
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param compagnieCode
	 * @param dateHeureDepart
	 * @param dateHeureArrivée
	 * @param destination
	 */
	public void creation(String compagnieCode, Date dateHeureDepart, Date dateHeureArrivée, ArrayList<Location> destination) {
		// TODO - implement VoyageSingleton.creation
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param trajetCode
	 */
	public void supprimer(String trajetCode) {
		// TODO - implement VoyageSingleton.supprimer
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param prix
	 * @param trajetCode
	 */
	public void assignationPrix(double prix, String trajetCode) {
		// TODO - implement VoyageSingleton.assignationPrix
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param infrastructureCode
	 */
	public void consultationTrajet(LocationSingleton infrastructureCode) {
		// TODO - implement VoyageSingleton.consultationTrajet
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param compagnieId
	 */
	public void consultationCompagnie(String compagnieId) {
		// TODO - implement VoyageSingleton.consultationCompagnie
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param visiteur
	 */
	public void accept(Visiteur visiteur) {
		// TODO - implement VoyageSingleton.accept
		throw new UnsupportedOperationException();
	}

}