package tri;

import java.util.Comparator;

import sets.Pays;

public class ComparatorHabitant implements Comparator<Pays> {

	@Override
	public int compare(Pays o1, Pays o2) {
		if (o1.getNbHabitants() > o2.getNbHabitants()) {
			return 1;
		} else if (o1.getNbHabitants() == o2.getNbHabitants()) {
			return -1;
		}
		return 0;
	}

}
