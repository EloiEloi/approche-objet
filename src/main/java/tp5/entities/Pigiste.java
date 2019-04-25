package tp5.entities;

public class Pigiste extends Intervenant {

	private double joursTravaillesParMois;
	private double tarifJour;
	private String statut;

	public void afficherDonnees() {
		super.afficherDonnees();
		System.out.println(" statut = " + statut);
	}

	@Override
	public double getSalaire() {
		return joursTravaillesParMois * tarifJour;
	}

	/**
	 * @return the joursTravaillesParMois
	 */
	public double getJoursTravaillesParMois() {
		return joursTravaillesParMois;
	}

	/**
	 * @param joursTravaillesParMois
	 *            the joursTravaillesParMois to set
	 */
	public void setJoursTravaillesParMois(double joursTravaillesParMois) {
		this.joursTravaillesParMois = joursTravaillesParMois;
	}

	/**
	 * @return the tarifJour
	 */
	public double getTarifJour() {
		return tarifJour;
	}

	/**
	 * @param tarifJour
	 *            the tarifJour to set
	 */
	public void setTarifJour(double tarifJour) {
		this.tarifJour = tarifJour;
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
