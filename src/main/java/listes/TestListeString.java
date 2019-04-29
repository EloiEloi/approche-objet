package listes;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Eloi
 *
 */
public class TestListeString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> listeVille = new ArrayList<>();
		listeVille.add("Nice");
		listeVille.add("Carcassonne");
		listeVille.add("Narbonne");
		listeVille.add("Lyon");
		listeVille.add("Foix");
		listeVille.add("Pau");
		listeVille.add("Marseille");
		listeVille.add("Tarbes");

		// recherche de la ville dans la liste qui a le plus grand nombre de
		// lettres
		int nbLettres = 0;
		int NbLettresMax = 0;
		String villeLettresMax = "";

		for (int i = 0; i < listeVille.size(); i++) {
			nbLettres = listeVille.get(i).length();
			if (nbLettres > NbLettresMax) {
				NbLettresMax = nbLettres;
				villeLettresMax = listeVille.get(i);
			}

		}
		System.out.println("le ville possedant le plus grand nombre de lettres est : " + villeLettresMax);

		// modification du contenu de la liste de manière à mettre tous les noms
		// de villes en majuscules

		for (String ville : listeVille) {
			ville.toUpperCase();
		}

		// suppression des villes de la liste, dont les noms commencent pas la
		// lettre N
		Iterator<String> valeur = listeVille.iterator();
		while (valeur.hasNext()) {
			String maVille = valeur.next();
			if (maVille.startsWith("N")) {
				valeur.remove();
			}
		}

		System.out.println(listeVille);

	}

}
