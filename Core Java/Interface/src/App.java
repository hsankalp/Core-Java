
public class App {

	public static void main(String[] args) {

		Machine mach1 = new Machine();
		mach1.start();
		
		Person person1 = new Person("Sankalp");
		person1.speak();
		
		Info info1 = mach1;
		info1.showInfo();
		
		Info info2 = person1;
		info2.showInfo();
		
		outputinfo(mach1);
		outputinfo(person1);
		
	}
	
	public static void outputinfo(Info info){
		
		info.showInfo();
	}
}
