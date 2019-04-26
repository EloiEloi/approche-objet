package tp5.entities;

import tp5.utils.RandomUtils;

/**
 * @author Eloi
 *
 */
public class Creature extends Personnage {

	public Creature() {

		int minForce = 0;
		int maxForce = 0;
		int minPoint = 0;
		int maxPoint = 0;

		int nbAleatoire = RandomUtils.getRandom(1, 3);

		if (nbAleatoire == 1) {
			this.typeDePerso = "Loup";
			minForce = 5;
			maxForce = 10;
			minPoint = 5;
			maxPoint = 10;
		} else if (nbAleatoire == 2) {
			this.typeDePerso = "Gobelin";
			minForce = 7;
			maxForce = 12;
			minPoint = 10;
			maxPoint = 15;
		} else if (nbAleatoire == 3) {
			this.typeDePerso = "Troll";
			minForce = 12;
			maxForce = 20;
			minPoint = 20;
			maxPoint = 30;
		}

		this.force = RandomUtils.getRandom(minForce, maxForce);
		this.pointDeVie = RandomUtils.getRandom(minPoint, maxPoint);

	}
}
