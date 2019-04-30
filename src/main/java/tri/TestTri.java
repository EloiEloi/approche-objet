package tri;

import java.util.ArrayList;
import java.util.Collections;

import sets.Pays;

public class TestTri {

	public static void main(String[] args) {
		ArrayList<Pays> listPays = new ArrayList<>();
		listPays.add(new Pays("USA", 327167434, 55805));
		listPays.add(new Pays("France", 67795000, 38476));
		listPays.add(new Pays("Allemagne", 82979100, 47589));
		listPays.add(new Pays("UK", 65105246, 43770));
		listPays.add(new Pays("Italie", 60483973, 29866));
		listPays.add(new Pays("Japon", 126330302, 39058));
		listPays.add(new Pays("Chine", 1417913092, 7989));
		listPays.add(new Pays("Russie", 146780700, 11099));
		listPays.add(new Pays("Inde", 1296834042, 1626));

		// on tri la list avec la 1ere methode

		System.out.println("TRI SELON Le nb habitants (1ERE METHODE)");

		Collections.sort(listPays);

		for (int i = 0; i < listPays.size(); i++) {
			System.out.println(listPays.get(i).getNom() + " (" + listPays.get(i).getNbHabitants() + " hab)");
		}

		// on tri la list avec l 'autre methode
		System.out.println("\nTRI SELON Le nb habitants (2ND METHODE)");
		listPays.sort(new ComparatorHabitant());

		for (int i = 0; i < listPays.size(); i++) {
			System.out.println(listPays.get(i).getNom() + " (" + listPays.get(i).getNbHabitants() + " hab)");
		}

		// on tir selon le pib avec la 2nd methode
		System.out.println("\nTRI SELON LE PIB (2ND METHODE)");
		listPays.sort(new ComparatorPibHabitant());

		for (int i = 0; i < listPays.size(); i++) {
			System.out.println(listPays.get(i).getNom() + " (pib/hab :" + listPays.get(i).getPibParHab() + ")");
		}
	}

}
