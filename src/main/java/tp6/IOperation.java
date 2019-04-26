package tp6;

/**
 * @author Eloi
 *
 *         Cette interface impose une signature à toute classe souhaitant
 *         effectuer une opération sur 2 entiers
 */
public interface IOperation {
	/**
	 * 
	 * Cette méthode effectue un calcul sur 2 entiers et retourne un résultat
	 * 
	 * @param a
	 *            entier
	 * @param b
	 *            entier
	 * @return int
	 */

	int calcul(int a, int b);

}
