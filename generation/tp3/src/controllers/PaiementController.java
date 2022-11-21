package controllers;
import java.util.Date;

import model.Paiement;

public class PaiementController {

	private Paiement paiement;

	/**
	 * 
	 * @param nom
	 * @param numCarte
	 * @param dateExp
	 */
	public boolean paiementCarte(String nom, int numCarte, Date dateExp) {
		// TODO - implement PaiementController.paiementCarte
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nom
	 * @param numCarte
	 * @param dateExp
	 */
	public boolean annulerPaiement(String nom, int numCarte, Date dateExp) {
		// TODO - implement PaiementController.annulerPaiement
		throw new UnsupportedOperationException();
	}

	public Paiement getPaiement() {
		return this.paiement;
	}

	/**
	 * 
	 * @param paiement
	 */
	public void setPaiement(Paiement paiement) {
		this.paiement = paiement;
	}

}