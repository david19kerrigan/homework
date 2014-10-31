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

    
	
    //Spacing/tabs are messed up for these first two because I copied them from the codinbat website (I wrote them on the website and pasted them here.)
  
    public int sum67(int[] nums) {
    int total = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 6) {
        while(nums[i] != 7)
          i++;
      }
      else
        total += nums[i];
    }
    return total;
    }

    public boolean more14(int[] nums) {
    int ones = 0;
    int fours = 0;
    for (int i = 0; i < nums.length; i++) {
    	if (nums[i] == 1)
    		ones++;
        if (nums[i] == 4)
            fours++;
    }
    if(ones > fours){return 1;}
    else{return 0;}
    }
    public int freq(int i){
	int total = 0;
	int character=a[i];
	for(int j = 0; j < a.length; j++){
	    if(a[j] == character){total++;}
	}
	return total;
    }
    //I can't really understand what the question is asking; this is the most ambiguous writing I have ever seen.  The code is functional but it doesn't seem to satisfy the constraints of the question.

	public int[] tenRun(int[] nums) {
		boolean multiple = 0
		for(int i = 0; i < nums.length; i++){
			if(nums[i]%10==0 && multipe==0){
				multiple = 1;

			}
			if(nums[i]%10==0 && multiple==1){
				multiple = 0;
			}
			if(boolean){
				nums[i]=10;
			}
		}
	return ints;
  

	public boolean tripleUp(int[] nums) {
  		for(int i = 0; i < nums.length-3; i++){
  			int j=nums[i+2];
  			int k=nums[i+1]+1;
  			int current=nums[i]+2;
  			if(current==k & k==j){
  				return true;
  			}
  		}
  		return false;

		

	}
  	
	public boolean canBalance(int[] nums){
		int tLeft = 0;
		int tRight = 0;
		for(int i = 1; i < nums.length - 1; i++){
			for(int j = 0; j < i; j++){
				tLeft+=nums[j];
			}
			for(int h = i; h < nums.length; h++){
				tRight+=nums[h];

			}
			if(tLeft==tRight){return true;}

		}
		return false;
	}
  	
	public int[] seriesUp(int n){
		int current = 0;
		int lengthOf = (n*(n+1))/2;
		int[] a = new int[lengthOf];
		for(int i = 1; i < n+1; i++){
			for(int j = 1; j < i + 1; j++){
				a[current] = j;
				current+=1;
			}

		}
		return a;
	}

  //Doesn't run becuase we haven't learned how to make nested arrays yet

  public int maxMirror(int[] nums) {
      int len = nums.length;
      int currentA = 0;
      int lengthO = (len*(len+1));
      Object[] newA = new Object[lengthO];
      for(int start = 0; start < nums.length - 1; start++){
        for(int end = start + 1; end < nums.length; end++){
          
          int[] newArray = Arrays.copyOfRange(newA, start, end);
          newA[currentA] = newArray;
          current++;
        }
      }
      arrayZ = 0;
      for(int startC = 1; start < nums.length; start++){
        for(int endC = startC - 1; end >= 0; end = end - 1){
          
          int[] newArrayC = Arrays.copyOfRange(newA, startC, endC);
          newA[arrayZ] = newArrayC;
          current++;
        }
      }
      for(int i = 0; i < newA.length; i++){
        for(int b = 0; b < newA.length; b++){
          if(b != i){
            arrayB = newA[b];
            arrayI = newA[i];
            ArrayList arrayListB = new ArrayList();
            ArrayList arrayListI = new ArrayList();
            for(int i = 0; i < arrayB.length; i++){
              arrayListB.add(arrayB[i]);
            }
            for(int ab = 0; ab < arrayI.length; ab++){
              arrayListI.add(arrayI[ab]);
            }

            
            if(arrayListB==Collections.reverse(arrayListI)){return arrayB.length;}

          }
        }
      }
      return 0;
  }

	    
}

