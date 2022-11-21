package model;
import java.util.Date;

public class Reservation {

	private Date date;
	private String reservationCode;
	private boolean fenetre;

	public String getReservationCode() {
		return this.reservationCode;
	}

	/**
	 * 
	 * @param reservationCode
	 */
	public void setReservationCode(String reservationCode) {
		this.reservationCode = reservationCode;
	}

	public boolean getFenetre() {
		return this.fenetre;
	}

	/**
	 * 
	 * @param fenetre
	 */
	public void setFenetre(boolean fenetre) {
		this.fenetre = fenetre;
	}

	public Date getDate() {
		return this.date;
	}

	/**
	 * 
	 * @param date
	 */
	public void setDate(Date date) {
		this.date = date;
	}

}