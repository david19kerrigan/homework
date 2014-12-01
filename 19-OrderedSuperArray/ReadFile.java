import java.io.*;
import java.util.*;

public class Readfile{
    public static void main(String[] args){
	Scanner sc = new Scanenr(new File("words.txt"));
	while(sc.hasNext()){
	    String s =sc.next();
	    System.out.println("Next line: "+s);
	}
    }
}
