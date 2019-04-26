package tp5.entities;

import tp5.utils.RandomUtils;

/**
 * @author Eloi
 *
 */
public class Hero extends Personnage {

	private int score = 0;
	private String nom;

	public Hero(String nom) {
		this.nom = nom;
		this.force = RandomUtils.getRandom(12, 18);
		this.pointDeVie = RandomUtils.getRandom(20, 50);
		this.typeDePerso = "Héro";
	}

	// @Override
	public void affichageInfosPersonnage() {
		super.affichageInfosPersonnage();
		String message = "nom = " + nom + "\n";
		message += "score = " + score + "\n";
		System.out.println(message);
	}

	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}

	/**
	 * @param score
	 *            the score to set
	 */
	public void setScore(int score) {
		this.score = score;
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
