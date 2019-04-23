package fr.diginamic.entites;

public class AdressePostale {

	public int numero;
	public String voie;
	public int codePostal;
	public String ville;

	/**
	 * @param numero
	 * @param voie
	 * @param codePostal
	 * @param ville
	 */
	public AdressePostale(int numero, String voie, int codePostal, String ville) {
		this.numero = numero;
		this.voie = voie;
		this.codePostal = codePostal;
		this.ville = ville;

	}

}
