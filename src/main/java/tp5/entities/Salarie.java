package tp5.entities;

public class Salarie extends Intervenant {

	private double salaire;
	private String statut;

	public void afficherDonnees() {
		super.afficherDonnees();
		System.out.println(" statut = " + statut);
	}

	/**
	 * @param salaire
	 *            the salaire to set
	 */
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	@Override
	public double getSalaire() {

		return salaire;
	}

	/**
	 * @return the statut
	 */
	public String getStatut() {
		return statut;
	}

	/**
	 * @param statut
	 *            the statut to set
	 */
	public void setStatut(String statut) {
		this.statut = statut;
	}

}
