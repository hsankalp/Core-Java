package CreateAndWrite;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		
		File file = new File("WriteTest.txt");

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
				
			bw.write("Line Number One");
			bw.newLine();
			bw.write("Line Number Two");
			bw.newLine();
			bw.write("Line Number Three");
			
		} catch (IOException e) {

			System.out.println("Unable to create file: "+file);
		}

	}

}
