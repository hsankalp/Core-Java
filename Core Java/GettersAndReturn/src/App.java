class Person {
	String name; // Data or Instance Variables
	int age;

	// Methods or Subroutines Lower case and void because it doesn't return
	void speak() {
		System.out.println("My name is " + name);
	}

	int calculateYearsToRetirement() {
		int yearsToRetire = 65 - age;
		return yearsToRetire;
	}

	int getAge() {
		return age;
	}

	String getName() {
		return name;
	}
}

public class App {
	public static void main(String[] args) {

		Person person1 = new Person(); // create object
		person1.name = "Sankalp Heranjal"; // data
		person1.age = 24;
		// person1.speak(); // methods

		//int years = person1.calculateYearsToRetirement();

		// System.out.println("Years to Retirement = " + years);

		int age = person1.getAge();
		String name = person1.getName();

		System.out.println("Name is " + name + " and age is " + age);
	}
}
