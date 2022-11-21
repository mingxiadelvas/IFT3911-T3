package model;
import java.util.Date;

public class Paiement {

	private int numCarte;
	private Date dateExp;

	public int getNumCarte() {
		return this.numCarte;
	}

	/**
	 * 
	 * @param numCarte
	 */
	public void setNumCarte(int numCarte) {
		this.numCarte = numCarte;
	}

	public Date getDateExp() {
		return this.dateExp;
	}

	/**
	 * 
	 * @param dateExp
	 */
	public void setDateExp(Date dateExp) {
		this.dateExp = dateExp;
	}

}