import java.util.*;
public class Driver{
	public static void main(String[] args){
		ArrayList<int> s = new ArrayList<int>();
		for(int i = 0; i < 21; i++){
			Random r = new Random();
			s.add(r.nextInt(9)+1);
		}
		int[] newA = new int[10];
		for(int i = 0; i < s.length; i++){
			if(newA[s.get(i)]>1){s.remove(i);}
			else{newA[s.get(i)]++;}
		}


	}
}
