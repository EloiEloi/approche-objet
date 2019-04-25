package tp5.tests;

import tp5.entities.Pigiste;
import tp5.entities.Salarie;

public class TestIntervenant {

	public static void main(String[] args) {
		Salarie sal1 = new Salarie();
		sal1.setSalaire(2500);
		sal1.setPrenom("Mickey");
		sal1.setNom("Mouse");
		sal1.setStatut("salarié");

		Pigiste pig1 = new Pigiste();

		pig1.setTarifJour(450);
		pig1.setJoursTravaillesParMois(20);
		pig1.setPrenom("Tom");
		pig1.setNom("Cruise");
		pig1.setStatut("pigiste");

		sal1.afficherDonnees();
		pig1.afficherDonnees();
	}

}
