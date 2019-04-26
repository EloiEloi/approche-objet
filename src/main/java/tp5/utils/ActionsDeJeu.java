package tp5.utils;

import tp5.entities.Personnage;

/**
 * @author Eloi
 *
 */
public class ActionsDeJeu {

	public static void combattre(Personnage combattant1, Personnage combattant2) {
		System.out.println("Coup donné");

		int nombreAleatoire;
		int valeurCoupHero;
		int ValeurCoupCreature;
		// lancement des attaque des 2 personnages

		// force + nombreAleatoire entre 1 et 10;

		// pour le hero
		nombreAleatoire = RandomUtils.getRandom(1, 10);
		// valeurCoupHero = monHero.force + nombreAleatoire;

		// pour la creature
		nombreAleatoire = RandomUtils.getRandom(1, 10);
		// ValeurCoupCreature = force + nombreAleatoire;
		// comparaison des 2 attaques pour determiner l'attaque gagnante

	}

}
