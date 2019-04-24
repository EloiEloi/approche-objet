package fr.diginamic.operations;

public class CalculMoyenne {

	private double[] tab;
	private int index = 0;

	public CalculMoyenne(int longueur) {

		if (longueur == 0) {
			System.out.println("ERREUR : longueur de tableau = 0");
		} else if (longueur < 0) {
			System.out.println("ERREUR : longueur de tableau NEGATIVE");
		} else {
			tab = new double[longueur];
		}

	}

	public void ajout(double monAjout) {
		if (index < tab.length) {
			tab[index++] = monAjout;
		} else {
			System.out.println("ERREUR : impossible d ajouter, tableau plein. La valeur n'a pas été ajouté");
		}

	}

	public double calcul() {
		double monCalcul = 0;
		for (int i = 0; i < tab.length; i++) {
			monCalcul = monCalcul + tab[i];
		}
		monCalcul = monCalcul / tab.length;

		return monCalcul;
	}

}
