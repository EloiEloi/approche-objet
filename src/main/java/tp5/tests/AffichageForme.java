package tp5.tests;

import tp5.entities.Forme;

public class AffichageForme {

	public static void afficher(Forme maForme) {
		System.out.println("Périmètre de :" + maForme.getClass().getSimpleName() + " = " + maForme.calculerPerimetre());
		System.out.println("Surface de :" + maForme.getClass().getSimpleName() + " = " + maForme.calculerSurface());
	}

}
