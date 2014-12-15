public class Searching{
	Comparable[] a;
	public Searching(n){
		a = Comparable[n];

	}
	public void add(int index, int value){
		a[index]=value;

	}
	public void sortI(){
		Arrays.sort(a);

	}
	public int Isearch(int value){
		for(int i = 0; i < a.length; i++){
			if(a[i] == value){return i;}

		}
		return 0;
	}
	public int bsearch(int value){
		private int i = a.length/2
		int lowerBound = 0;
		int upperBound = a.length;
		while(a[i] != value){
			if(a[i] < value){
				i = i+upperBound/2
				upperBound = upperBound/2;
			}
			if(a[i] > value){
				i = i + lowerBound/2;
				lowerBound = lowerBound *2;
			}

		}
		return i;
	}
	public int rbsearch(int value){
		int lowerBound = 0;
		int upperBound = a.length;
		int i = a.length/2;
		if(a[i] == value){return i;}
		else{rbsearch(lowerBound,upperBound)}

	}
	public int rbsearch(int low, int high){
		if(a[i] < value){
				i = i+upperBound/2
				upperBound = upperBound/2;
			}
			if(a[i] > value){
				i = i + lowerBound/2;
				lowerBound = lowerBound *2;
			}
		}
		rbsearch(lowerBound,upperBound);

	}
	public static void main(String[] args){
		for(int i = 0; i < a.length; i++){
			Random r = new Random();
			a.add(i,r.nextInt(10));
		}
	}
	
}