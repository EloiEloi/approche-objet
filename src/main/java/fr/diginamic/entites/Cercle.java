package fr.diginamic.entites;

public class Cercle {
	private double rayon;

	public Cercle(double rayon) {
		this.rayon = rayon;
	}

	public double retournerPerimetre() {
		return 2 * Math.PI * rayon;
	}

	public double retournerSurface() {
		return Math.PI * (rayon * rayon);

	}

	/**
	 * @return the rayon
	 */
	public double getRayon() {
		return rayon;
	}

	/**
	 * @param rayon
	 *            the rayon to set
	 */
	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

}
