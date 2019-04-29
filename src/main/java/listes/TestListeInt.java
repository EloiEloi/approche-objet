/**
 * 
 */
package listes;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Eloi
 *
 */
public class TestListeInt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<Integer> listeInt = new ArrayList<>();
		listeInt.add(-1);
		listeInt.add(5);
		listeInt.add(7);
		listeInt.add(3);
		listeInt.add(-2);
		listeInt.add(4);
		listeInt.add(8);
		listeInt.add(5);

		// affichage de tous les éléments de la liste
		System.out.println("contenu de la liste :");
		System.out.println(listeInt);

		// recherche du plus grand élément de la liste
		int elementPlusGrand = listeInt.get(0);
		for (int i = 1; i < listeInt.size(); i++) {
			if (listeInt.get(i) > elementPlusGrand) {
				elementPlusGrand = listeInt.get(i);
			}
		}

		// suppression du plus petit élément de la liste
		int elementPlusPetit = listeInt.get(0);
		int indexPlusPetit = 0;
		for (int i = 1; i < listeInt.size(); i++) {
			if (listeInt.get(i) < elementPlusPetit) {
				elementPlusPetit = listeInt.get(i);
				indexPlusPetit = i;
			}
		}
		listeInt.remove(indexPlusPetit);

		// recherche de tous les éléments négatifs et les modifie pour les
		// passer en positif
		Iterator<Integer> intNegatif = listeInt.iterator();
		while (intNegatif.hasNext()) {
			Integer monInt = intNegatif.next();
			if (monInt < 0) {
				intNegatif.remove();
			}
		}
		System.out.println(listeInt);
	}

}
