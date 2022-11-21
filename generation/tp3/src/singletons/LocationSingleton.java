package singletons;

import model.Location;

public class LocationSingleton {

	private LocationSingleton singleton;

	public Location fabricateLocation() {
		// TODO - implement LocationSingleton.fabricateLocation
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param typeInfrastructure
	 * @param ville
	 */
	public String creation(String typeInfrastructure, String ville) {
		// TODO - implement LocationSingleton.creation
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param locationCode
	 * @param ville
	 */
	public void modifier(String locationCode, String ville) {
		// TODO - implement LocationSingleton.modifier
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param locationCode
	 */
	public void supprimer(String locationCode) {
		// TODO - implement LocationSingleton.supprimer
		throw new UnsupportedOperationException();
	}

	public LocationSingleton getSingleton() {
		return this.singleton;
	}

}