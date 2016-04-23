
public class App {

	public static void main(String[] args) {
		
		System.out.println(factorial(10));

	}
	
	private static int factorial(int i){
		
		if (i==1){
			return 1;
		}
		
		return factorial(i-1)*i;
	}
}
