package tp6;

public class ExecuterOperation {

	public int execute(IOperation monOp, int entierA, int entierB) {
		return monOp.calcul(entierA, entierB);
	}

}
