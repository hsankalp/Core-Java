
public class App {

	public static void main(String[] args) {

		Animal animal = Animal.CAT;
		
		switch(animal){
		case CAT:
			System.out.println("Its a Cat");
			break;
		case DOG:
			System.out.println("Its a Dog");
			break;
		case LION:
			System.out.println("Its a Lion");
			break;
		case RAT:
			System.out.println("Its a Rat");
			break;
		case TIGER:
			System.out.println("Its a Tiger");
			break;
		default:
			break;
			
		}
		
		System.out.println(Animal.LION);
		System.out.println(Animal.LION.getName());
		System.out.println(Animal.LION.name());
	}
	
	

}
