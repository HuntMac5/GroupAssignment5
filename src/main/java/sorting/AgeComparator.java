package sorting;

import java.util.Comparator;

import animals.Pets;

public class AgeComparator implements Comparator<Pets> {

	@Override
	public int compare(Pets p1, Pets p2) {
		return Integer.compare(p1.getAge(), p2.getAge());
	}

}
