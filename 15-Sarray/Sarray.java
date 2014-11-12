public class Sarray {
    int[] data = new int[] {0,1,2,3,4,5,6,7};
    int   last;
    int len = data.length;

    public Sarray() {
        // set up the initial instance variables
     int len = data.length;

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
 int[] newA = new int[this.len+1];
 newA[len+1] = i;
 return true;
}
public boolean full(int[] nums){
 for(int element : nums){
     if(element == 0) return false;
 }
 return true;
}
public void  add(int index, int i){
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
    data[index] = 0;
    return oldd;
        // removes the item at index i
        // returns the old value
}
}
