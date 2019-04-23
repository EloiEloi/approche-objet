package fr.diginamic.essais;

import fr.diginamic.entites.AdressePostale;

public class TestAdressePostale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		AdressePostale adresse1 = new AdressePostale();
		adresse1.numero = 130;
		adresse1.voie = "rue Beau Soleil";
		adresse1.codePostal = 44340;
		adresse1.ville = "Bouguenais";
		
		AdressePostale adresse2 = new AdressePostale();
		adresse2.numero = 4;
		adresse2.voie = "rue Bruller";
		adresse2.codePostal = 75014;
		adresse2.ville = "Paris";
	
	
	}

}
