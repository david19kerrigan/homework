public class Sarray{
    String[] data = new String[0]; 
    private int len;

    public Sarray() {
        // set up the initial instance variables
	int last = 0;
        len = data.length;

    }
   
    
    public String toString(){
	String ans = "";
	for(int i = 0; i < data.length; i++){
	    ans+=data[i]+",";
	}
	return ans;
    }
    public boolean add(int i){
        // adds an item to the end of the list, grow if needed
        // returns true
	String[] newA = new String[data.length+2];
	for( int c = 0; c < data.length; c++){
	    newA[c] = data[c];
	}
	newA[data.length+1] = i;
	data = newA;
	return true;
    }
    public boolean full(String[] nums){
	for(String element : nums){
	    if(element.equals("null") return false;
	}
	return true;
    }
    public void  add(int index, String i){
	try{int abcdefgh = data[index];
	}catch(IndexOutOfBoundsException e){
	    System.out.println(e);
	}
        // adds item i  at index, shifting everything down as needed.
        // also grows as needed abc
	if(!full(data)){

	    int[] newA = new int[len+1];
	}
	int[] newA = data;
	for (int j = len - 2; j >= index ; j--){
	    int l = j + 1;
	    newA[l] = newA[j];

	}
	newA[index]=i;

    }

    public int size() {
	return data.length;
        // returns the number of items in the list (not the array size)
    }

    public int get(int index) {
	try{int abcdefgh = data[index];
	}catch(IndexOutOfBoundsException e){
	    System.out.println(e);
	}
	return data[index];
        // returns the item at location index of the lsit
    }

    public int set(int index, int i){
	try{int abcdefgh = data[index];
	}catch(IndexOutOfBoundsException e){
	    System.out.println(e);
	}
	int old = data[index];
	data[index] = i;
	return old;
        // sets the item at location index to value i
        // returns the old value. 
    }

    public int remove(int index){
	try{int abcdefgh = data[index];
	}catch(IndexOutOfBoundsException e){
	    System.out.println(e);
	}
	int oldd = data[index];
	data[index] = null;
	return oldd;
        // removes the item at index i
        // returns the old value
    }
}



