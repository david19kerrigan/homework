import java.util.Collections;
public class Driver {
    public static void main(String[] args){
	/*
	Basechar c = new Basechar();
	Warrior w = new Warrior();
	Mage m = new Mage();
	Basechar c2;
	Warrior w2;
	Mage m2;

	// nope w2 = m;
	// nope w2 = c;

	// this works -- note that c2.getHealth() calls getHealth in the
	// warrior subclass
	c2 = w;
        System.out.println(c2.getHealth());

	c2 = m;
        System.out.println(c2.getHealth());
        System.out.println( ((Mage)c2).getManna()   );

	w.setName("Groo");
	m.setName("Mr. Sage");

	w.attack(m);
	m.attack(w);
	w.attack(w);
	System.out.println(w.toString());
	System.out.println(w);
	*/

	Warrior w2 = new Warrior("a")
	Warrior w3 = new Warrior("b")
	Warrior w4 = new Warrior("c")
	Warrior w5 = new Warrior("d")
	Warrior w6 = new Warrior("e")
	Arraylist<Object> a = new ArrayList<Object>();
	a.add(w2);
	a.add(w3);
	a.add(w4);
	a.add(w5);
	a.add(w6);
	ArrayList<String> names = new ArrayList<String>();
	names.add(w2.getName());
	names.add(w3.getName());
	names.add(w4.getName());
	names.add(w5.getName());
	names.add(w6.getName());
	Collections.sort(names);


    }
}
