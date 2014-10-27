public class Driver{
	public String greeting = new String ("Hello world!");
	public void greet() {
		//String greeting = new String("Sup!");
		/* when uncojmmendted the new string greeting does not 
			change the instance variable, THis new greeting is as local varaiable
			and the instasnce variable still exists
			Local variables hide isntasnce variables of the same name.\
		*/
		System.out.println(greeting);
	}
	public void ungreet(){
		System.out.println("I'm out");
	}
}
