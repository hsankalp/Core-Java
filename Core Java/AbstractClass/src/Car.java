
public class Car extends Machine {

	@Override
	public void start() {

		System.out.println("Car Started...");

	}

	@Override
	public void work() {

		System.out.println("Car Working...");

	}

	@Override
	public void shutdown() {

		System.out.println("Car Shutdown...");

	}

}
