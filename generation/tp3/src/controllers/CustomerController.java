package controllers;

import model.Customer;

public class CustomerController {

	private Customer customer;

	/**
	 * 
	 * @param nom
	 * @param courriel
	 * @param numPasseport
	 * @param reservationCode
	 */
	public int creation(String nom, String courriel, int numPasseport, int reservationCode) {
		// TODO - implement CustomerController.creation
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param numCustomer
	 * @param nom
	 * @param courriel
	 * @param numPasseport
	 * @param reservationCode
	 */
	public int modifier(int numCustomer, String nom, String courriel, int numPasseport, int reservationCode) {
		// TODO - implement CustomerController.modifier
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param numCustomer
	 */
	public void supprimer(int numCustomer) {
		// TODO - implement CustomerController.supprimer
		throw new UnsupportedOperationException();
	}

	public Customer getCustomer() {
		return this.customer;
	}

	/**
	 * 
	 * @param customer
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}