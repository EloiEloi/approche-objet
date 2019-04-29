package listes;

/**
 * @author Eloi
 *
 */
public class Ville {
	String nom;
	double nbHabitants;

	public Ville(String nom, double nbHabitants) {
		this.nom = nom;
		this.nbHabitants = nbHabitants;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the nbHabitants
	 */
	public double getNbHabitants() {
		return nbHabitants;
	}

	/**
	 * @param nbHabitants
	 *            the nbHabitants to set
	 */
	public void setNbHabitants(double nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

}
