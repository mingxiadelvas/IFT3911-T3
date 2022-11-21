package model;
public abstract class Section {

	private Section sectionCode;
	private double prix;

	public double getPrix() {
		return this.prix;
	}

	/**
	 * 
	 * @param prix
	 */
	public void setPrix(double prix) {
		this.prix = prix;
	}

	public String getSectionCode() {
		// TODO - implement Section.getSectionCode
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param sectionCode
	 */
	public void setSectionCode(Section sectionCode) {
		this.sectionCode = sectionCode;
	}

}