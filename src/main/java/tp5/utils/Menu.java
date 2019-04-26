package tp5.utils;

import java.util.Scanner;

import tp5.entities.Creature;
import tp5.entities.Hero;

/**
 * @author Eloi
 *
 */
public class Menu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// creation d'un scanner
		Scanner scanner = new Scanner(System.in);
		int valeur;
		Hero monHero = null;

		do {

			System.out.println("Choisissez une action :");
			System.out.println("1 : creer un personnage");
			System.out.println("2 : combattre une créature");
			System.out.println("3 : afficher score");
			System.out.println("4 : quitter");

			// recuperation de la valeur entree par l'utilisateur
			valeur = scanner.nextInt();

			if (valeur == 1) {
				System.out.println("Entrez le nom de votre Héro");
				String monNom = scanner.next();
				monHero = new Hero(monNom);

			} else if (valeur == 2) {

				if (monHero == null) {
					String message = "vous n'avez pas encore créé de personnage";
					System.out.println(message);
				} else if (monHero.isVivant()) {

					// creation d'une creature
					Creature maCreature = new Creature();
					// maCreature.affichageInfosPersonnage();

					System.out.println("Début du combat");

					// do {
					//
					// ActionDeJeu.combatreCreature();
					//
					// } while (condition);

					System.out.println("Fin du combat");

				} else if (!monHero.isVivant()) {
					String message = "Votre personnage est décédé. Il a obtenu le score de X points. Veuillez créer un nouveau personnage";
					System.out.println(message);
				}

			} else if (valeur == 3) {
				if (monHero == null) {
					System.out.println("vous n'avez pas encore créé de personnage");
				} else {
					System.out.println(monHero.getScore());
				}

			} else if (valeur == 4) {
				System.out.println("A bientôt");
			}

		} while (valeur != 4);

		// fermeture du scanner
		scanner.close();

	}

}
