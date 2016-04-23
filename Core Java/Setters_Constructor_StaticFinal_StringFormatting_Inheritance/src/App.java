class Frog {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name; // "this.name" refers to instance variable and "name"
							// refers to parameters
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

public class App {

	public static void main(String[] args) {

		Frog frog1 = new Frog();

		// frog1.name = "Chillar";
		// frog1.age = 25;

		frog1.setName("Chillar");
		frog1.setAge(25);

		System.out.println(frog1.getName());
		System.out.println(frog1.getAge());
	}

}
