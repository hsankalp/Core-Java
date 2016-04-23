package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {

		List<Integer> arraylist = new ArrayList<Integer>();
		List<Integer> linkedlist = new LinkedList<Integer>();

		benchmarking("Array List", arraylist);
		benchmarking("Linked List", linkedlist);

	}

	private static void benchmarking(String type, List<Integer> list) {

		for (int i = 0; i < 1E5; i++) {
			list.add(i);
		}

		long start = System.currentTimeMillis();
		
		/*
		for (int i = 0; i < 1E5; i++) {
			list.add(i);
		}
		*/
		
		for (int i = 0; i < 1E5; i++) {
			list.add(0, i);
		}
		

		long end = System.currentTimeMillis();

		System.out.println("Time taken: " + (end - start) + "ms for " + type);
	}

}
