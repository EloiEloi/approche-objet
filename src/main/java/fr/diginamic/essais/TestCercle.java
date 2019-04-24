package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;
import fr.diginamic.utils.CercleService;

public class TestCercle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cercle cercle1 = new Cercle(5);
		Cercle cercle2 = new Cercle(9);

		System.out.println(
				"cercle 1 : perimetre = " + cercle1.retournerPerimetre() + "; surface = " + cercle1.retournerSurface());

		Cercle cercle3 = CercleFactory.creationCercle(7);
		System.out.println(cercle3.retournerPerimetre());

		CercleService.doubler(cercle2);

		Cercle cercle4 = new Cercle(10);
		CercleService.doubler(cercle4);
		System.out.println(cercle4.getRayon());

	}

}
