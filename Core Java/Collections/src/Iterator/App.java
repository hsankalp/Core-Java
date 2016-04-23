package Iterator;

import java.util.Iterator;
import java.util.LinkedList;

public class App {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();

		list.add("Cat");
		list.add("Dog");
		list.add("Rat");
		list.add("Lion");

		// New way of iteration post Java 5
		for (String item : list) {

			System.out.println(item);
		}

		// Using Iterator; Advantage of removing while iterating
		System.out.println();
		System.out.println("UsingIterator:");

		Iterator<String> it = list.iterator();

		while (it.hasNext()) {

			String value = it.next();
			System.out.println(value);

			if (value == "Rat") {		//Advantage of removing while iterating
				it.remove();
				System.out.println("Removed item: " + value);
			}
		}

		System.out.println("\nNew List: " + list);

	}

}
