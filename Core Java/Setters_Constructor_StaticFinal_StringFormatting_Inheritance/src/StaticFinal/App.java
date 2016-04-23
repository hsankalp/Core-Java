package StaticFinal;

class Product {
	public final static int UNIQUE_NUMBER = 16891; // Final Constant, can't
													// change

	public String name; // Instance Variable
	public int id;

	public static String description; // Class Variable
	public static int count = 0;

	public Product() {	//Constructor

		id = count;
		count++;	//Counts number of Objects
	}

	public void showName() {

		System.out.println("Object id: " + id + " Desc: " + description + " Name: " + name); // This
	
	}

	public static void showDesc() {
		System.out.println(description);
		// System.out.println(name); 			This wont Work
	}
}

public class App {

	public static void main(String[] args) {

		Product.description = "Liquor Name:";
		Product.showDesc();

		System.out.println("Before objects are created, the count is: " + Product.count);

		Product product1 = new Product();
		Product product2 = new Product();

		System.out.println("After objects are created, the count is: " + Product.count);

		product1.name = "Malibu";
		product2.name = "Jack Daniels";

		product1.showName();
		product2.showName();

		System.out.println(Math.PI);

		System.out.println(Product.UNIQUE_NUMBER);

	}

}
