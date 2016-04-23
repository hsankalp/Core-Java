public class Animal implements Runnable {

	@Override
	public void run() {
		System.out.println("Animal running");
		System.out.println("Run by " + Thread.currentThread().getName());
	}
}
