package fr.diginamic.operations;

import java.util.ArrayList;

public class CalculMoyenne {

	private ArrayList<Double> liste;

	public CalculMoyenne(int longueur) {

		if (longueur == 0) {
			System.out.println("ERREUR : longueur de tableau = 0");
		} else if (longueur < 0) {
			System.out.println("ERREUR : longueur de tableau NEGATIVE");
		} else {
			liste = new ArrayList<Double>();
		}

	}

	public void ajout(double monAjout) {
		liste.add(monAjout);
	}

	public double calcul() {
		double monCalcul = 0;
		for (int i = 0; i < liste.size(); i++) {
			monCalcul = monCalcul + liste.get(i);
		}
		monCalcul = monCalcul / liste.size();

		return monCalcul;
	}

}
