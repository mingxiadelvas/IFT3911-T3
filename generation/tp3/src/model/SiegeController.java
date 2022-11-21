package model;

public class SiegeController  {

	protected Siege siege;

	/**
	 * 
	 * @param siegeType
	 */
	public void supprimer(SiegeType siegeType) {
		// TODO - implement SiegeController.supprimer
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param vehiculeCode
	 * @param range
	 * @param colonne
	 * @param siegeType
	 */
	public void creation(int vehiculeCode, int range, int colonne, SiegeType siegeType) {
		// TODO - implement SiegeController.creation
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param vehiculetCode
	 * @param sectionPaquebot
	 */
	public void creationSectionPaquebot(int vehiculetCode, SectionPaquebot sectionPaquebot) {
		// TODO - implement SiegeController.creationSectionPaquebot
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param vehiculeCode
	 * @param range
	 * @param colonne
	 * @param siegeType
	 */
	public void modifier(int vehiculeCode, int range, int colonne, SiegeType siegeType) {
		// TODO - implement SiegeController.modifier
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param trajetCode
	 * @param siegeType
	 */
	public void reserverSiege(String trajetCode, SiegeType siegeType) {
		// TODO - implement SiegeController.reserverSiege
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param trajetCode
	 * @param sectionPaquebot
	 */
	public void reserverCabine(String trajetCode, SectionPaquebot sectionPaquebot) {
		// TODO - implement SiegeController.reserverCabine
		throw new UnsupportedOperationException();
	}

	public Siege getSiege() {
		return this.siege;
	}

	/**
	 * 
	 * @param siege
	 */
	public void setSiege(Siege siege) {
		this.siege = siege;
	}

}