package ArrayList;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(1000);
		list.add(1234);
		list.add(16891);

		System.out.println(list.get(1));

		System.out.println("Iteration 1:");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		list.remove(list.size() - 1);

		// Too Slow, better to use Linked List when removing first or from
		// middle
		list.remove(0);

		System.out.println("Iteration 2:");
		for (Integer value : list) {
			System.out.println(value);
			
		}

	}

}
