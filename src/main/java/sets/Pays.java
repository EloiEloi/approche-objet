package sets;

public class Pays {

	String nom;
	long nbHabitants;
	int pibParHab;

	/**
	 * @param nom
	 * @param nbHabitants
	 * @param pibParHab
	 */
	public Pays(String nom, long nbHabitants, int pibParHab) {
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.pibParHab = pibParHab;
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
	public long getNbHabitants() {
		return nbHabitants;
	}

	/**
	 * @param nbHabitants
	 *            the nbHabitants to set
	 */
	public void setNbHabitants(long nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

	/**
	 * @return the pibParHab
	 */
	public int getPibParHab() {
		return pibParHab;
	}

	/**
	 * @param pibParHab
	 *            the pibParHab to set
	 */
	public void setPibParHab(int pibParHab) {
		this.pibParHab = pibParHab;
	}

}
