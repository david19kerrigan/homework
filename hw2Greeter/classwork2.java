public class Driver{
	public static void main(String[] args){
		Greeter g1 = new Greeter();
		Greeter g2 = new Greeter();
		System.out.println("BEFORE")		
		g1.greet();
		g2.greet();
		g1.greeting = new String("No.");
		System.out.println("AFTER");
		g1.greet();
		g2.greet();
	}
}

