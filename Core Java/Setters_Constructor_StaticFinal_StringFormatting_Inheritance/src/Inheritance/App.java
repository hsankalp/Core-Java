package Inheritance;

public class App {

	public static void main(String[] args) {

		Machine machine1 = new Machine();
		Car car1 = new Car();

		machine1.start();
		machine1.stop();

		car1.start();
		car1.wiper();
		car1.showInfo();
		car1.stop();

		
	}

}
