
public class App {

	public static void main(String[] args) {
		
		Plant plant1 = new Plant();
		
		Cactus cactus1 = new Cactus();
		
		System.out.println(plant1.name);
		System.out.println(plant1.type);
		
		//Won't work; size is private
		//System.out.println(plant1.size);
		
		System.out.println(plant1.height);
		
		
		System.out.println(cactus1.height);
	}

}
