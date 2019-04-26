package tp5.entities;

/**
 * @author Eloi
 *
 */
public class Personnage {

	protected int force;
	protected int pointDeVie;
	protected String typeDePerso;
	protected boolean vivant = true;

	public void affichageInfosPersonnage() {
		String message = "\ninfos pour " + typeDePerso + " : \n";
		if (vivant != false) {
			message += "force : " + force + "\n";
			message += "point de vie : " + pointDeVie;

		} else {
			message += "le personnage est mort :(";
		}

		System.out.println(message);

	}

	/**
	 * @return the force
	 */
	public int getForce() {
		return force;
	}

	/**
	 * @param force
	 *            the force to set
	 */
	public void setForce(int force) {
		this.force = force;
	}

	/**
	 * @return the pointDeVie
	 */
	public int getPointDeVie() {
		return pointDeVie;
	}

	/**
	 * @param pointDeVie
	 *            the pointDeVie to set
	 */
	public void setPointDeVie(int pointDeVie) {
		this.pointDeVie = pointDeVie;
	}

	/**
	 * @return the vivant
	 */
	public boolean isVivant() {
		return vivant;
	}

	/**
	 * @param vivant
	 *            the vivant to set
	 */
	public void setVivant(boolean vivant) {
		this.vivant = vivant;
	}

}
