package StringFormatting;

public class App {

	public static void main(String[] args) {

		/*
		 * Inefficient String info = "";
		 * 
		 * info+="My name is Sankalp"; info+=" "; info+="I am a Student";
		 * 
		 * System.out.println(info);
		 */

		StringBuilder sb = new StringBuilder("");
		sb.append("My name is Sankalp");
		sb.append(" ");
		sb.append("I am a student");

		System.out.println(sb.toString());

		StringBuilder sb1 = new StringBuilder();

		sb1.append("My name is Heranjal").append(" ").append("I am an Engineer");

		System.out.println(sb1.toString());

		for (int i = 1; i <= 20; i++) {
			System.out.printf("%2d\n", i);
		}

	}

}
