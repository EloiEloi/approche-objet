package tp5.tests;

import tp5.entities.Chambre;
import tp5.entities.Cuisine;
import tp5.entities.Maison;
import tp5.entities.SalleDeBain;
import tp5.entities.Salon;
import tp5.entities.Wc;

public class TestMaison {

	public static void main(String[] args) {

		Salon salon1 = new Salon(60, 0);
		Chambre chambre1 = new Chambre(15, 0);

		Chambre chambre2 = new Chambre(20, 1);
		Chambre chambre3 = new Chambre(15, 1);

		Wc wc1 = new Wc(5, 0);
		Wc wc2 = new Wc(5, 1);
		Cuisine cuis1 = new Cuisine(12, 0);
		SalleDeBain sdb1 = new SalleDeBain(10, 0);
		SalleDeBain sdb2 = new SalleDeBain(10, 1);

		Maison maison1 = new Maison();
		maison1.ajouterPiece(salon1, chambre1, chambre2, chambre3, wc1, wc2, cuis1, sdb1, sdb2);

		System.out.println(maison1.calculerSurface());
		System.out.println(maison1.getSuperficieParEtage(0));

		System.out.println(maison1.getSuperficieParTypePiece("Wc"));
		System.out.println(maison1.getNbPiecesPartypePiece("Wc"));

	}

}
