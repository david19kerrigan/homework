import java.util.*;
public class Arraystuff{
    Random rand = new Random();
    private int[] a = new int[100];
    public String toString(){
	String s = ""+a.length;
        
	return s;
    }
    public Arraystuff(){
	a=new int[100];
	   for (int i =0;i<a.length;i++){
	       a[i] = rand.nextInt(76)+75;
	   }
    }
    public static void main(String[] args){
	Arraystuff as = new Arraystuff();

    }
}

