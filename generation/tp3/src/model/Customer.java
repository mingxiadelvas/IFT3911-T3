package model;
public class Customer {

	private String nom;
	private String courriel;
	private int numPasseport;

	public String getNom() {
		return this.nom;
	}

	/**
	 * 
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNumPasseport() {
		return this.numPasseport;
	}

	/**
	 * 
	 * @param numPasseport
	 */
	public void setNumPasseport(int numPasseport) {
		this.numPasseport = numPasseport;
	}

	public String getCourriel() {
		return this.courriel;
	}

	/**
	 * 
	 * @param courriel
	 */
	public void setCourriel(String courriel) {
		this.courriel = courriel;
	}

}