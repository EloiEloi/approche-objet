package fr.diginamic.utils;

import fr.diginamic.entites.Cercle;

public class CercleService {

	public static void doubler(Cercle monCercle) {

		monCercle.setRayon(monCercle.getRayon() * 2);
	}

}
