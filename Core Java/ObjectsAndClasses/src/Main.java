class Person {

	// Data or Instance Variables
	String name;
	int age;

	// Methods or Subroutines
	// Lower case and void because it doesn't return
	void speak() {

		System.out.println("My name is " + name + " and my age is " + age);

	}

	void sayHello() {

		System.out.println("Hello There!");

	}
}

public class Main {

	public static void main(String[] args) {

		Person person1 = new Person(); // create object

		person1.name = "Sankalp Heranjal"; // data
		person1.age = 24;

		person1.speak(); // methods
		person1.sayHello();

		Person person2 = new Person(); // create object

		person2.name = "Satinder Pal"; // data
		person2.age = 25;

		person2.speak(); // methods
		person2.sayHello();

	}

}
