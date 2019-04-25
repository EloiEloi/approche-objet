package tp5.entities;

public abstract class Intervenant {

	private String nom;
	private String prenom;

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */

	public abstract double getSalaire();

	public void afficherDonnees() {

		System.out.println(" salaire de : " + this.prenom + " " + this.nom + " = " + this.getSalaire());

	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom
	 *            the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
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

}
