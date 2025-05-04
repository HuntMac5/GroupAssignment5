package sorting;

import java.util.Comparator;

import animals.Pets;

public class NameComparator implements Comparator<Pets> {

	@Override
	public int compare(Pets p1, Pets p2) {
		return p1.getName().compareTo(p2.getName());
	}

}