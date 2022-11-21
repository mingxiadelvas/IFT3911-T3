package model;
public abstract class Location {

	private String ville;
	private String infrastructureCode;

	public String getVille() {
		return this.ville;
	}

	/**
	 * s
	 * @param ville
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getInfrastructureCode() {
		return this.infrastructureCode;
	}

	/**
	 * 
	 * @param infrastructureCode
	 */
	public void setInfrastructureCode(String infrastructureCode) {
		this.infrastructureCode = infrastructureCode;
	}

	public String getTypeInfrastructure() {
		// TODO - implement Location.getTypeInfrastructure
		throw new UnsupportedOperationException();
	}

}