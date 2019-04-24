package fr.diginamic.essais;

import fr.diginamic.entites.AdressePostale;
import fr.diginamic.entites.Client;

public class testClient {

	public static void main(String[] args) {

		AdressePostale adresse = new AdressePostale(130, "rue Beau Soleil", 44340, "Bouguenais");

		Client c1 = new Client(10, "Turpin", "Eloi", adresse);
		Client c2 = new Client(20, "Machin ", "bidule", adresse);

		c1.modifierNom("Mickey");
		c1.modifierPrenom("mouse");

		System.out.println(c1.retournerPrenom());

	}

}
