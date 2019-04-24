package fr.diginamic.utils;

public class TriTableau {

	public static int[] trier(int[] monTableau) {

		int IndexPlusPetitElement;
		int elementTemp;

		for (int i = 0; i < monTableau.length; i++) {
			IndexPlusPetitElement = i;
			for (int j = i + 1; j < monTableau.length; j++) {
				if (monTableau[j] < monTableau[IndexPlusPetitElement]) {
					IndexPlusPetitElement = j;
				}
			}
			elementTemp = monTableau[i];
			monTableau[i] = monTableau[IndexPlusPetitElement];
			monTableau[IndexPlusPetitElement] = elementTemp;
		}

		return monTableau;
	}

}
