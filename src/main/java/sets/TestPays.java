package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestPays {

	public static void main(String[] args) {
		Set<Pays> monSetPays = new HashSet<>();

		monSetPays.add(new Pays("USA", 327167434, 55805));
		monSetPays.add(new Pays("France", 67795000, 38476));
		monSetPays.add(new Pays("Allemagne", 82979100, 47589));
		monSetPays.add(new Pays("UK", 65105246, 43770));
		monSetPays.add(new Pays("Italie", 60483973, 29866));
		monSetPays.add(new Pays("Japon", 126330302, 39058));
		monSetPays.add(new Pays("Chine", 1417913092, 7989));
		monSetPays.add(new Pays("Russie", 146780700, 11099));
		monSetPays.add(new Pays("Inde", 1296834042, 1626));

		// on recherche le pays avec le pib/habitant le plus important
		String nomPaysPibParHabMax = "";
		long nbPaysPibParHabMax = 0;
		Iterator<Pays> monIt = monSetPays.iterator();
		while (monIt.hasNext()) {
			Pays monPays = monIt.next();
			if (monPays.getPibParHab() > nbPaysPibParHabMax) {
				nbPaysPibParHabMax = monPays.getPibParHab();
				nomPaysPibParHabMax = monPays.getNom();
			}

		}

		System.out.println("pays avc le pib/hab le plus important est : " + nomPaysPibParHabMax);

		// on recherche le pays avec le pib le plus important

		String nomPaysPibTtotalMax = "";
		long nbPaysPibtotalMax = 0;
		monIt = monSetPays.iterator();
		while (monIt.hasNext()) {
			Pays monPays = monIt.next();
			if (monPays.getPibParHab() * monPays.getNbHabitants() > nbPaysPibtotalMax) {
				nbPaysPibtotalMax = monPays.getPibParHab() * monPays.getNbHabitants();
				nomPaysPibTtotalMax = monPays.getNom();
			}

		}
		System.out.println("Le pays possédant le pib total le plus important est : " + nomPaysPibTtotalMax
				+ " (pib total = " + nbPaysPibtotalMax + ") ");

		// on modifie le contenu du hashset pour passer en minuscules le pays
		// qui a le pib total plus petit

		Pays paysPibTotalMin = null;
		long nbPaysPibTotalMin = Long.MAX_VALUE;
		monIt = monSetPays.iterator();
		while (monIt.hasNext()) {
			Pays monPays = monIt.next();
			if (monPays.getPibParHab() * monPays.getNbHabitants() < nbPaysPibTotalMin) {
				nbPaysPibTotalMin = monPays.getPibParHab() * monPays.getNbHabitants();
				paysPibTotalMin = monPays;

			}

		}

		paysPibTotalMin.setNom(paysPibTotalMin.getNom().toUpperCase());

		// on supprime le pays dont le pib total est le plus
		monSetPays.remove(paysPibTotalMin);

		// on affiche l'ensemble

		for (Pays pays : monSetPays) {
			System.out.println(pays.getNom() + " : " + pays.getNbHabitants() + " habitants , pib total =  "
					+ pays.getPibParHab() * pays.getNbHabitants());
		}
	}

}
