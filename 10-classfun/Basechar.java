/* superclass for warrior (base class) and Mage */
public class Basechar {
    private int health=20;
    private String name;

    public String toString(){
	return this.getName();
    }
    /*
    public Basechar(String name){
	this.name=name;

      
    }
    
    public Basechar(){
	this.name="joe";
    }
    */
    public void attack(Basechar other){
	//System.out.println(this.getName()+" is attacking "+other.getName());
	System.out.println(this+" is attacking "+other);

    }
    
    public void setName(String name){
	this.name = name;
    }
    
    public String getName(){
	return this.name;
    }

    public int getHealth() {
	return this.health;
    }

    
}
