package fr.diginamic.essais;

import fr.diginamic.entites.AdressePostale;

public class TestAttributClasse {

	public static void main(String[] args) {
		AdressePostale a = new AdressePostale(666, "route de la mort", 99999, "Enfer");
		AdressePostale b = new AdressePostale(69, "route du sexe", 69000, "Paradis");

		System.out.println(a.nbDepartements);
		System.out.println(b.nbDepartements);
		System.out.println(AdressePostale.nbDepartements);

		AdressePostale.nbDepartements = 102;

		System.out.println(a.nbDepartements);
		System.out.println(b.nbDepartements);
		System.out.println(AdressePostale.nbDepartements);
	}

}
