package tp5.tests;

import tp5.entities.Carre;
import tp5.entities.Cercle;
import tp5.entities.Rectangle;

public class TestForme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cercle cercle1 = new Cercle(10);

		Carre carre1 = new Carre(20);

		Rectangle rect1 = new Rectangle(30, 50);

		AffichageForme.afficher(cercle1);
		AffichageForme.afficher(carre1);
		AffichageForme.afficher(rect1);

	}

}
