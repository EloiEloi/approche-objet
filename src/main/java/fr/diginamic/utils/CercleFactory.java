package fr.diginamic.utils;

import fr.diginamic.entites.Cercle;

public class CercleFactory {

	public static Cercle creationCercle(double param) {
		Cercle c = new Cercle(param);
		return c;
	}

}
