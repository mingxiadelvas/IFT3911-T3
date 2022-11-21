package model;

import etats.Etat;

public abstract class Siege {

	private int placeCode;
	private boolean disponibilite;
	protected SiegeType type;
	private boolean confirmee;

	public int getPlaceCode() {
		return this.placeCode;
	}

	/**
	 * 
	 * @param placeCode
	 */
	public void setPlaceCode(int placeCode) {
		this.placeCode = placeCode;
	}

	/**
	 * 
	 * @param s
	 */
	public void setState(Etat s) {
		// TODO - implement Siege.setState
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param e
	 */
	public void event(String e) {
		// TODO - implement Siege.event
		throw new UnsupportedOperationException();
	}

	public boolean getConfirmee() {
		return this.confirmee;
	}

	/**
	 * 
	 * @param confirmee
	 */
	public void setConfirmee(boolean confirmee) {
		this.confirmee = confirmee;
	}

}