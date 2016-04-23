import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = -6527184829467679860L;

	int id;
	String name;

	public Person(int id, String name) {

		this.id = id;
		this.name = name;

	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

}
