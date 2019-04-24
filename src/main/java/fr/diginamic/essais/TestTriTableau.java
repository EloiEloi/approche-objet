package fr.diginamic.essais;

import fr.diginamic.utils.TriTableau;

public class TestTriTableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tab = { 4, 1, 9, 2, 3 };

		tab = TriTableau.trier(tab);

		for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i]);
		}

	}

}
