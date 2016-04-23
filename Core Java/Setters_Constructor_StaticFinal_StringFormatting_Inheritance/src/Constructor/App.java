package Constructor;

class Machine {
	private String name;
	private int id;

	public Machine() {
		System.out.println("1st Constaructor Running");
		name = "Sankalp";
	}

	public Machine(String name) {
		System.out.println("2nd Constaructor Running");
		this.name = name;
	}

	public Machine(String name, int id) {
		System.out.println("3rd Constaructor Running");
		this.name = name;
		this.id = id;
	}

}

public class App {

	public static void main(String[] args) {

		Machine machine1 = new Machine();
		Machine machine2 = new Machine("Sankalp");
		Machine machine3 = new Machine("Satinder", 12345);
	}

}
