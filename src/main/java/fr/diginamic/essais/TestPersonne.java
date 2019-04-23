package fr.diginamic.essais;

import fr.diginamic.entites.AdressePostale;
import fr.diginamic.entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne personne1 = new Personne();
		Personne personne2 = new Personne();
		
		AdressePostale adresse1 = new AdressePostale();
		adresse1.voie = "rue Bruller";
		adresse1.codePostal = 75014;
		adresse1.numero = 4;
		adresse1.ville = "Paris";
		
		AdressePostale adresse2 = new AdressePostale();
		adresse2.voie = "rue Beau Soleil";
		adresse2.codePostal = 44340;
		adresse2.numero = 130;
		adresse2.ville = "Bouguenais";
		
		personne1.nom = "Turpin";
		personne1.prenom = "Eloi";
		personne1.adresse = adresse1;
		
		personne2.nom = "truc";
		personne2.prenom = "Bidule";
		personne2.adresse = adresse2;
	}

}
