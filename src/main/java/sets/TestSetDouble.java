package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author Eloi
 *
 */
public class TestSetDouble {

	public static void main(String[] args) {

		Set<Double> monHSet = new HashSet<>();
		monHSet.add(1.5);
		monHSet.add(8.25);
		monHSet.add(-7.32);
		monHSet.add(13.3);
		monHSet.add(-12.45);
		monHSet.add(48.5);
		monHSet.add(0.01);
		monHSet.add(13.3);

		// affichage des éléments de de la collection
		System.out.println(monHSet);

		// on recherche le plus grand élément de la collection
		double plusGrandElement = Double.MIN_VALUE;
		Iterator<Double> monIt = monHSet.iterator();
		while (monIt.hasNext()) {
			double valeur = monIt.next();
			if (valeur > plusGrandElement) {
				plusGrandElement = valeur;
			}

		}
		System.out.println("plus grand élément vaut : " + plusGrandElement);
	}
}
