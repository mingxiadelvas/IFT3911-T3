package controllers;
import java.util.Date;

import model.Location;
import model.Reservation;
import model.Section;
import model.SectionPaquebot;
import model.SiegeType;
import visiteurs.IVisitable;
import visiteurs.Visiteur;

public class ReservationController implements IVisitable {

	private Reservation reservation;

	/**
	 * 
	 * @param trajetCode
	 * @param sectionPaquebot
	 */
	public void reservationCabine(String trajetCode, SectionPaquebot sectionPaquebot) {
		// TODO - implement ReservationController.reservationCabine
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param trajetCode
	 * @param destination
	 * @param date
	 * @param section
	 */
	public void verificationVolTrain(String trajetCode, Location destination, Date date, Section section) {
		// TODO - implement ReservationController.verificationVolTrain
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param trajetCode
	 * @param siegeType
	 * @param fenetre
	 */
	public void reservationSiege(String trajetCode, SiegeType siegeType, boolean fenetre) {
		// TODO - implement ReservationController.reservationSiege
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param trajetCode
	 * @param date
	 * @param sectionPaquebot
	 */
	public void verificationPaquebot(String trajetCode, Date date, SectionPaquebot sectionPaquebot) {
		// TODO - implement ReservationController.verificationPaquebot
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param reservationCode
	 */
	public boolean reservationValide(int reservationCode) {
		// TODO - implement ReservationController.reservationValide
		throw new UnsupportedOperationException();
	}

	public Reservation getReservation() {
		return this.reservation;
	}

	/**
	 * 
	 * @param visiteur
	 */
	public void accept(Visiteur visiteur) {
		// TODO - implement ReservationController.accept
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param trajetCode
	 */
	public void trajetDisponible(String trajetCode) {
		// TODO - implement ReservationController.trajetDisponible
		throw new UnsupportedOperationException();
	}

}