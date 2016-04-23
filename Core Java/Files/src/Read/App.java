package Read;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws FileNotFoundException {

		String filename = "Test.txt";
		
		File textfile = new File(filename);
		
		Scanner sc = new Scanner(textfile);
		
		int value = sc.nextInt();
		System.out.println("Next Integer Value: "+value);
		
		sc.nextLine();
		
		int count = 2;
		
		while(sc.hasNextLine()){
			
			String line = sc.nextLine();
			
			System.out.printf("%2d: %s\n",count,line);
			count++;
		}
		sc.close();
	}

}
