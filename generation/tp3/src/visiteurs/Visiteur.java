package visiteurs;

import controllers.ReservationController;

public abstract class Visiteur {

	/**
	 * 
	 * @param trajet
	 */
	public abstract void visitTrajet(int trajet);

	/**
	 * 
	 * @param dispo
	 */
	public abstract void visitVerification(ReservationController dispo);

}