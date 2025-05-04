package sorting;

import java.util.Comparator;
import animals.Pets;

public class SpeciesComparator implements Comparator<Pets> {

	@Override
	public int compare(Pets p1, Pets p2) {
		return p1.getSpecies().compareTo(p2.getSpecies());
	}

}
