package model;
public abstract class Compagnie {

	private String compagnieCode;
	private String nom;

	public String getCompagnieCode() {
		return this.compagnieCode;
	}

	/**
	 * 
	 * @param compagnieCode
	 */
	public void setCompagnieCode(String compagnieCode) {
		this.compagnieCode = compagnieCode;
	}

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

}