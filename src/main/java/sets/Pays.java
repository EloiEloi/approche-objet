package sets;

public class Pays implements Comparable<Pays> {

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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pays other = (Pays) obj;
		if (nbHabitants != other.nbHabitants)
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (pibParHab != other.pibParHab)
			return false;
		return true;
	}

	@Override
	public int compareTo(Pays monPays) {

		if (pibParHab > monPays.getPibParHab()) {
			return 1;
		} else if (pibParHab == monPays.getPibParHab()) {
			return 0;
		}

		return -1;
	}

}
