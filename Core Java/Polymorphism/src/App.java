
public class App {

	public static void main(String[] args) {

		Plant plant1 = new Plant();
		Tree tree1 = new Tree();

		Plant plant2 = tree1;

		plant1.grow();
		tree1.grow();
		plant2.grow();

		tree1.shed();

		// wont work; plant2 of Plant variable
		// plant2.shed();
		doGrow(plant2);
	}
	
	public static void doGrow(Plant plant){
		
		plant.grow();
		
	}
}