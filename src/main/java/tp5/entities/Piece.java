package tp5.entities;

public abstract class Piece {

	private double superficie;
	private int numEtage;

	public Piece(double superficie, int numEtage) {
		this.superficie = superficie;
		this.numEtage = numEtage;

	}

	/**
	 * @return the superficie
	 */
	public double getSuperficie() {
		return superficie;
	}

	/**
	 * @param superficie
	 *            the superficie to set
	 */
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	/**
	 * @return the numEtage
	 */
	public int getNumEtage() {
		return numEtage;
	}

	/**
	 * @param numEtage
	 *            the numEtage to set
	 */
	public void setNumEtage(int numEtage) {
		this.numEtage = numEtage;
	}

}
