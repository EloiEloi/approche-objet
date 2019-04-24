package fr.diginamic.entites;

public class Cercle {
	public double rayon;

	public Cercle(double rayon) {
		this.rayon = rayon;
	}

	public double retournerPerimetre() {
		return 2 * Math.PI * rayon;
	}

	public double retournerSurface() {
		return Math.PI * (rayon * rayon);

	}

}
