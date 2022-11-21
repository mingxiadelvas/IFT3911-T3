package model;

import composite.CreationVehicule;

public class Vehicule implements CreationVehicule {

	private int colonne;
	private int range;

	public int getColonne() {
		return this.colonne;
	}

	/**
	 * 
	 * @param colonne
	 */
	public void setColonne(int colonne) {
		this.colonne = colonne;
	}

	public int getRange() {
		return this.range;
	}

	/**
	 * 
	 * @param range
	 */
	public void setRange(int range) {
		this.range = range;
	}

	/**
	 * 
	 * @param compagnieCode
	 * @param range
	 * @param colonne
	 */
	public int vehiculeCode(String compagnieCode, int range, int colonne) {
		// TODO - implement Vehicule.vehiculeCode
		throw new UnsupportedOperationException();
	}

}