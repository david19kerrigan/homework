public class Driver{
	public static void main(String[] args){
		Greeter g1 = new Greeter();
		Greeter g2 = new Greeter();
		System.out.println("BEFORE")		
		g1.greet();
		g2.greet();
		g1.greeting = new String("No.");
		//greeint is treated like a nwe variable 
		/*instance varaibles are most like turtle variables,
		  where each variable can have its values changed independantly
		*/
		System.out.println("AFTER");
		g1.greet();
		g2.greet();
	}
}

