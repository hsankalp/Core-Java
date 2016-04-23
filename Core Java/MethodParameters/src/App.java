class Robot {
	
	public void speak(String text){
		System.out.println(text);
	}
	
	public void jump(int height){
		System.out.println("Height of Jump = "+height);
	}
	
	public void move(String direction, double distance){
		System.out.println("Moving " +distance+"m in "+direction);
	}
}

public class App {
	public static void main(String[] args) {
		
		Robot Rob = new Robot();
		
		Rob.speak("Hello Guys");
		Rob.jump(80);
		Rob.move("North", 13.567);
		
		String greeting = "Wassup my friends!";
		Rob.speak(greeting);
		
		int value = 14;
		Rob.jump(value);
	}
}
