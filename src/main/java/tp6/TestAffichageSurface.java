package tp6;

import tp5.entities.Carre;
import tp5.entities.Chambre;
import tp5.entities.Maison;

public class TestAffichageSurface {

	public static void main(String[] args) {
		Chambre chambre1 = new Chambre(15, 0);
		Chambre chambre2 = new Chambre(22, 0);

		Maison maison1 = new Maison();
		maison1.ajouterPiece(chambre1, chambre2);

		AffichageSurface affSurf = new AffichageSurface();
		affSurf.afficher(maison1);

		Carre monCarre = new Carre(10);
		affSurf.afficher(monCarre);
	}

}
