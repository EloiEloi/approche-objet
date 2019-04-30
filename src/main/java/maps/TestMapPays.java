package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import sets.Pays;

public class TestMapPays {

	public static void main(String[] args) {
		Map<String, Pays> maMap = new HashMap<>();
		maMap.put("USA", new Pays("USA", 327167434, 55805));
		maMap.put("France", new Pays("France", 67795000, 38476));
		maMap.put("Allemagne", new Pays("Allemagne", 82979100, 47589));
		maMap.put("UK", new Pays("UK", 65105246, 43770));
		maMap.put("Italie", new Pays("Italie", 60483973, 29866));
		maMap.put("Japon", new Pays("Japon", 126330302, 39058));
		maMap.put("Chine", new Pays("Chine", 1417913092, 7989));
		maMap.put("Russie", new Pays("Russie", 146780700, 11099));
		maMap.put("Inde", new Pays("Inde", 1296834042, 1626));

		// listage des cles de la map

		Iterator<String> keysIt = maMap.keySet().iterator();
		while (keysIt.hasNext()) {
			System.out.println("clé : " + keysIt.next());
		}
		// listage des valeurs de la map
		Pays paysHabitantMin = null;
		long nbHabitantMin = Long.MAX_VALUE;
		Iterator<Pays> keysVal = maMap.values().iterator();
		while (keysVal.hasNext()) {
			Pays paysTemp = keysVal.next();
			if (paysTemp.getNbHabitants() < nbHabitantMin) {
				nbHabitantMin = paysTemp.getNbHabitants();
				paysHabitantMin = paysTemp;
			}

			System.out.println("valeur : " + paysTemp.getNom() + ", " + paysTemp.getNbHabitants() + " habitants, "
					+ paysTemp.getPibParHab() + " (pib/hab)");
		}
		// suppression du pays qui a le moins d'habitants
		maMap.remove(paysHabitantMin.getNom());

		// affichage du contenu de la map pour vérifier si la suppression a bien
		// été effectuée

		System.out.println("--------");
		keysVal = maMap.values().iterator();
		while (keysVal.hasNext()) {
			Pays paysTemp = keysVal.next();

			System.out.println("valeur : " + paysTemp.getNom() + ", " + paysTemp.getNbHabitants() + " habitants, "
					+ paysTemp.getPibParHab() + " (pib/hab)");
		}

	}

}
