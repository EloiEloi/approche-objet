package fr.diginamic.essais;

import fr.diginamic.operations.Operation;

public class TestOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("[15, 5, +] = " + Operation.calcul(15, 5, '+'));
		System.out.println("[15, 5, -] = " + Operation.calcul(15, 5, '-'));
		System.out.println("[15, 5, *] = " + Operation.calcul(15, 5, '*'));
		System.out.println("[15, 5, /] = " + Operation.calcul(15, 5, '/'));

	}

}
