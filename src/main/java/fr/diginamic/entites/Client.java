package fr.diginamic.entites;

public class Client {
	public int numeroCompte;
	public String nom;
	public String prenom;
	public AdressePostale adresse;

	/**
	 * @param numeroCompte
	 * @param nom
	 * @param prenom
	 */
	public Client(int numeroCompte, String nom, String prenom) {

		this.numeroCompte = numeroCompte;
		this.nom = nom;
		this.prenom = prenom;
	}

	/**
	 * @param numeroCompte
	 * @param nom
	 * @param prenom
	 */
	public Client(int numeroCompte, String nom, String prenom, AdressePostale adresse) {

		this(numeroCompte, nom, prenom);
		this.adresse = adresse;
	}

}
