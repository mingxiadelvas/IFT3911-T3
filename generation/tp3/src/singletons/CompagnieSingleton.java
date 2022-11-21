package singletons;

import model.Compagnie;
import model.Location;

public class CompagnieSingleton {

	private CompagnieSingleton singleton;

	public CompagnieSingleton getSingleton() {
		return this.singleton;
	}

	public Compagnie fabricateCompagnie() {
		// TODO - implement CompagnieSingleton.fabricateCompagnie
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param compagnieCode
	 */
	public void supprimer(String compagnieCode) {
		// TODO - implement CompagnieSingleton.supprimer
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nom
	 * @param typeInfrastructure
	 */
	public void creation(String nom, Location typeInfrastructure) {
		// TODO - implement CompagnieSingleton.creation
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param compagnieCode
	 * @param nom
	 * @param ville
	 */
	public void modifier(String compagnieCode, String nom, String ville) {
		// TODO - implement CompagnieSingleton.modifier
		throw new UnsupportedOperationException();
	}

}