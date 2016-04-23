package UsingObjectsMapsAndSets;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class App {

	public static void main(String[] args) {

		Person p1 = new Person(1, "Sankalp");
		Person p2 = new Person(2, "Heranjal");
		Person p3 = new Person(3, "Deven");
		Person p4 = new Person(1, "Sankalp");

		Map<Person, Integer> map = new HashMap<Person, Integer>();

		map.put(p1, 1);
		map.put(p2, 6);
		map.put(p3, 8);
		map.put(p4, 9);

		for (Person key : map.keySet()) {

			System.out.println(key + " : " + map.get(key));
		}

		Set<Person> set1 = new HashSet<Person>();

		set1.add(p1);
		set1.add(p2);
		set1.add(p3);
		set1.add(p4);

		System.out.println(set1);

	}

}
