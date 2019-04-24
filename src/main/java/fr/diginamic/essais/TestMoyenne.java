package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CalculMoyenne calc1 = new CalculMoyenne(3);
		calc1.ajout(10);
		calc1.ajout(15);
		calc1.ajout(6);
		calc1.ajout(6);
		System.out.println(calc1.calcul());
	}

}
