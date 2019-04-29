package listes;

import java.util.ArrayList;

/**
 * @author Eloi
 *
 */
public class TestVille {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<Ville> listeVilles = new ArrayList<>();

		listeVilles.add(new Ville("Nice", 343000));
		listeVilles.add(new Ville("Carcassonne", 47800));
		listeVilles.add(new Ville("Narbonne", 53400));
		listeVilles.add(new Ville("Lyon", 484000));
		listeVilles.add(new Ville("Foix", 9700));
		listeVilles.add(new Ville("Pau", 77200));
		listeVilles.add(new Ville("Marseille", 850700));
		listeVilles.add(new Ville("Tarbes", 40600));

		// recherche de la ville la plus peuplée
		String villePlusPeuplee = "";
		double nbMaxMHabitant = 0;
		for (int i = 0; i < listeVilles.size(); i++) {
			double maValeur = listeVilles.get(i).getNbHabitants();
			if (maValeur > nbMaxMHabitant) {
				nbMaxMHabitant = maValeur;
				villePlusPeuplee = listeVilles.get(i).getNom();
			}
		}
		System.out.println("la ville la plus peuplée est : " + villePlusPeuplee);

		// suppression de la ville la moins peuplée
		String villeMoinsPeuplee = "";
		double nbMinHabitant = nbMaxMHabitant;
		int indexSupp = 0;
		for (int i = 0; i < listeVilles.size(); i++) {
			double maValeur = listeVilles.get(i).getNbHabitants();
			if (maValeur < nbMinHabitant) {
				nbMinHabitant = maValeur;
				villeMoinsPeuplee = listeVilles.get(i).getNom();
				indexSupp = i;
			}
		}
		listeVilles.remove(indexSupp);

		// passage des noms des villes de plus de 100 000 habitants en
		// majuscules
		for (Ville ville : listeVilles) {
			if (ville.getNbHabitants() > 100000) {
				ville.setNom(ville.getNom().toUpperCase());
			}
		}

		// affiche de la liste
		for (Ville ville : listeVilles) {
			System.out.println(ville.getNom() + " : " + ville.getNbHabitants() + " habitants.");
		}

	}

}
