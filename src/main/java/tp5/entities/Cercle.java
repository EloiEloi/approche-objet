package tp5.entities;

public class Cercle extends Forme {

	private double rayon;

	public Cercle(double rayon) {
		this.rayon = rayon;
	}

	/**
	 * 
	 */
	public Cercle() {
		super();
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see tp5.entities.Forme#calculerSurface()
	 */
	@Override
	public double calculerSurface() {
		// TODO Auto-generated method stub
		return Math.PI * (rayon * rayon);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see tp5.entities.Forme#calculerPerimetre()
	 */
	@Override
	public double calculerPerimetre() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * rayon;
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
