package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author Eloi
 *
 */
public class TestSetString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<String> monHSet = new HashSet<>();
		monHSet.add("USA");
		monHSet.add("France");
		monHSet.add("Allemagne");
		monHSet.add("UK");
		monHSet.add("Italie");
		monHSet.add("Japon");
		monHSet.add("Chine");
		monHSet.add("Russie,");
		monHSet.add("Inde");

		// recherche du pays possedant le plus grand nombre de lettres
		int nbLettres = 0;
		int NbLettresMax = 0;
		String villeLettresMax = "";

		Iterator<String> monIt = monHSet.iterator();

		while (monIt.hasNext()) {
			String monString = monIt.next();
			nbLettres = monString.length();
			if (nbLettres > NbLettresMax) {
				NbLettresMax = nbLettres;
				villeLettresMax = monString;
			}
		}
		System.out.println(villeLettresMax);
	}

}
