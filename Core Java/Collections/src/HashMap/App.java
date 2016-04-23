package HashMap;

import java.util.HashMap;
import java.util.Map;

public class App {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "One");
		map.put(6, "Six");
		map.put(8, "Eight");
		map.put(91, "NinetyOne");

		System.out.println(map.get(6));

		for (Map.Entry<Integer, String> entry : map.entrySet()) {

			int key = entry.getKey();
			String value = entry.getValue();

			System.out.println("[" + key + ":" + value + "]");
		}
	}

}
