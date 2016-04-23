
public class App {

	public static void main(String[] args) {

		Animal a1 = new Animal();
		Thread t = new Thread(a1);
		t.setName("Fred");
		t.start();

	}

}
