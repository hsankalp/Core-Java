package Queues;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class App {

	public static void main(String[] args) {

		Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);

		q1.add(1);
		q1.add(2);
		q1.add(3);
		// q1.add(4); [Queue is full]

		System.out.println("Queue: " + q1);

		System.out.println("Head is: " + q1.element());

		System.out.println("Removed item: " + q1.remove());
		System.out.println("Removed item: " + q1.remove());
		System.out.println("Removed item: " + q1.remove());
		// System.out.println("Removed item: "+q1.remove()); [There were only 3 items]

		System.out.println("New Queue: " + q1);
		
		System.out.println("..................");

		Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(3);

		q2.offer(5); // Same as ADD but checks the size of queue
		q2.offer(6);
		q2.offer(7);
		q2.offer(8);

		System.out.println("Queue: " + q2);

		System.out.println("Head is: " + q2.peek()); // Same as ELEMENT

		System.out.println("Removed item: " + q2.poll()); // Same as REMOVE but
															// checks the size
															// of queue
		System.out.println("Removed item: " + q2.poll());
		System.out.println("Removed item: " + q2.poll());
		System.out.println("Removed item: " + q2.poll());

		System.out.println("New Queue: " + q2);
	}

}
