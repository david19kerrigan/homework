public class Max{
	private int[] a;
	public int findMax(){
		int init = 0;
		for(int i = 0; i < 100; i++){
			if(a[i]>init){init = a[i];}
		}
		return init;

	}
}