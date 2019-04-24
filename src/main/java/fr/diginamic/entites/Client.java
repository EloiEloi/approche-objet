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

	public String retournerPrenomMajuscule() {
		return prenom.toUpperCase();

	}

	public String retournerNomMajuscule() {
		return nom.toUpperCase();

	}

	public void modifierNom(String nom) {
		this.nom = nom;
	}

	public void modifierPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void modifierNumeroCompte(int numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public String retournerNom() {
		return nom;
	}

	public String retournerPrenom() {
		return prenom;
	}

	public int retournerNumeroCompte() {
		return numeroCompte;
	}

}
