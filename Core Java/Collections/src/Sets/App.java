package Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {

		Set<String> set1 = new HashSet<String>();
		// Unorganized

		// Set<String> set1 = new LinkedHashSet<String>();
		// As Added

		// Set<String> set1 = new TreeSet<String>();
		// Sorted

		// isEmpty
		if (set1.isEmpty()) {
			System.out.println("1.Set is Empty!!");
		}

		set1.add("Sankalp");
		set1.add("Heranjal");
		set1.add("Deven");
		set1.add("Chillar");

		System.out.println(set1);

		if (set1.isEmpty()) {
			System.out.println("2.Set is Empty!!");
		}

		// Iteration
		for (String value : set1) {

			System.out.println(value);

		}

		// Contains
		if (set1.contains("Sankalp")) {
			System.out.println("Sankalp Heranjal Present!!");
		} else {
			System.out.println("Not Present");
		}

		///////////////////////////////////////////////////////////////////////////

		Set<String> set2 = new HashSet<String>();

		set2.add("Sankalp");
		set2.add("Heranjal");
		set2.add("Sandeep");
		set2.add("Singh");

		// Intersection

		Set<String> intersection = new HashSet<String>(set1);

		intersection.retainAll(set2);

		System.out.println(intersection);

		// Difference

		Set<String> difference = new HashSet<String>(set1);

		difference.removeAll(set2);

		System.out.println(difference);

	}

}
