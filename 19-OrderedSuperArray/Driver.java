import java.util.*;
public class Driver{
	public static void main(String[] args){
		Sarray s = new Sarray();
		for(int i = 0; i < 21; i++){
			Random r = new Random();
			s.add(r.nextInt(9));
		}
		/*
		int[] newA = new int[10];
		for(int i = 0; i < s.size(); i++){
			if(newA[s.get(i)]>1){s.remove(i);}
			else{newA[s.get(i)]++;}
		}
		*/
		System.out.println(s);


	}
}
