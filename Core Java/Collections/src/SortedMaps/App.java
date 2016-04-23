package SortedMaps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {

	public static void main(String[] args) {

		Map<Integer, String> hashmap = new HashMap<Integer, String>();
		Map<Integer, String> linkedhashmap = new LinkedHashMap<Integer, String>();
		Map<Integer, String> treemap = new TreeMap<Integer, String>();

		testmap("Hash Map", hashmap); // Sometimes Sorted
		testmap("Linked Hash Map", linkedhashmap); // Order in which items added
		testmap("Tree Map", treemap); // Sorted

	}

	private static void testmap(String type, Map<Integer, String> map) {

		map.put(2, "Two");
		map.put(1, "One");
		map.put(5, "Five");
		map.put(6, "Six");
		map.put(3, "Three");

		System.out.println(type + ":");

		for (Integer key : map.keySet()) {

			String value = map.get(key);

			System.out.println("[" + key + ":" + value + "]");

		}
		System.out.println();
	}

}
