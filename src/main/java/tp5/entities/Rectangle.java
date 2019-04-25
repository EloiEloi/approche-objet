package tp5.entities;

public class Rectangle extends Forme {

	private double longueur;
	private double largeur;

	public Rectangle(double longueur, double largeur) {
		this.largeur = largeur;
		this.longueur = longueur;
	}

	@Override
	public double calculerSurface() {
		// TODO Auto-generated method stub
		return longueur * largeur;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see tp5.entities.Forme#calculerPerimetre()
	 */
	@Override
	public double calculerPerimetre() {
		// TODO Auto-generated method stub
		return 2 * (longueur + largeur);
	}

	/**
	 * @return the largeur
	 */
	public double getLargeur() {
		return largeur;
	}

	/**
	 * @param longueur
	 *            the largeur to set
	 */

	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}

	/**
	 * @return the longueur
	 */
	public double getLongueur() {
		return longueur;
	}

	/**
	 * @param longueur
	 *            the longueur to set
	 */
	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}
}
