public class Find{
    /*-----------------------Instance Variables----------------------*/
    private int[] a;

    /*-----------------------Constructors----------------------------*/
    public Find(){
	   Arraystuff a = new Arraystuff();
	
	
    }

    /*-------------------------Methods-------------------------------*/
    public int find(int thing){
	   for(int i = 0; i < 100; i++){
	       if(a[i]==thing){return i;}
	   }
	   return -1;
    }
}
