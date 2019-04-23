package fr.diginamic.essais;

import fr.diginamic.entites.AdressePostale;
import fr.diginamic.entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne personne1 = new Personne();
		Personne personne2 = new Personne();

		AdressePostale adresse1 = new AdressePostale(666, "route de la mort", 99999, "Enfer");

		personne1.nom = "Turpin";
		personne1.prenom = "Eloi";
		personne1.adresse = adresse1;

		personne2.nom = "truc";
		personne2.prenom = "Bidule";
		personne2.adresse = adresse1;
	}

}
