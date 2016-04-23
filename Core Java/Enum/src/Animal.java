
public enum Animal {

	CAT("Billi"), DOG("Bruno"), RAT("Jerry"), LION("Simba"), TIGER("Tigra");

	private String name;

	Animal(String name) {

		this.name = name;

	}

	public String getName() {
		return name;
	}

	public String toString() {

		return "Name of the animal is: " + name;
		
	}
}
