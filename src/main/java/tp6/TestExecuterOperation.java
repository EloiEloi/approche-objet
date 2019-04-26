package tp6;

/**
 * @author Eloi
 *
 */
public class TestExecuterOperation {

	public static void main(String[] args) {
		int a = 15;
		int b = 80;
		int resultat;

		ExecuterOperation exeOp = new ExecuterOperation();

		Addition ad = new Addition();
		Multiplication multi = new Multiplication();

		resultat = exeOp.execute(ad, a, b);

		System.out.println("resultat de addition des nombre : " + a + " et " + b + " = " + resultat);

		resultat = exeOp.execute(multi, a, b);

		System.out.println("resultat de addition des nombre : " + a + " et " + b + " = " + resultat);
	}

}
