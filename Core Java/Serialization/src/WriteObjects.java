import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {

	public static void main(String[] args) {

		System.out.println("Writing Objects...");

		Person person1 = new Person(168, "Sankalp");
		Person person2 = new Person(123, "Deven");

		System.out.println(person1);
		System.out.println(person2);

		try (FileOutputStream fos = new FileOutputStream("people.bin")) {

			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(person1);
			oos.writeObject(person2);

			oos.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
