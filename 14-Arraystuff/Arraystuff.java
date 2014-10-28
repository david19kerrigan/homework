import java.util.*;
public class Arraystuff{
    Random rand = new Random();
    private int[] a = new int[100];
    public String toString(){
	String s = "";
        for (int i = 0; i < a.length; i++) {
	    s = s + a[i]+", ";
	}
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
	System.out.println(as);
	System.out.println(as.freq(0));
    }

    
	

    
    public int freq(int i){
	int total = 0;
	int character=a[i];
	for(int j = 0; j < a.length; j++){
	    if(a[j] == character){total++;}
	}
	return total;
    }
	    
}

