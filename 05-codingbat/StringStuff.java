public class StringStuff{

    public String firstHalf(String str) {
	int len = str.length()/2;
	return(str.substring(0,len));
  
    }
    public String makeOutWord(String out, String word) {
	return(out.substring(0,2)+word+out.substring(2,4));
    }
    public boolean mixStart(String str) {
	if (str.contains("ix")){
	    if(str.substring(1,3).equals("ix")){
		return(true);}}
	else{ 
	    return(false);}
	return(false);
  
    }

    public String nonStart(String a, String b) {
	int lena = a.length();
	int lenb = b.length();
	return(a.substring(1,lena)+b.substring(1,lenb));
  
    }


    public String makeAbba(String a, String b) {
	return(a+b+b+a);
    }


    public int diff21(int n) {
	if(n>21){
	    return(2*(n-21));
	}
	else{
	    return(21-n);
	}
    }

    public boolean nearHundred(int n) {
	if(Math.abs(200-n)<11){
	    return(true);
	}
	if(Math.abs(100-n)<11){
	    return(true);
	}
	else{
	    return(false);
	}
  
    }


    public int teaParty(int tea, int candy) {
	if(candy>=5 && tea>=5){
	    if(candy>=2*tea || tea>=2*candy){
		return(2);
	    }
	    else{
		return(1);
	    }
	}
	else{
	    return(0);
	}  
  
   
   
    }

    public boolean lastDigit(int a, int b, int c) {
	int lasta = a%10;
	int lastb = b%10;
	int lastc = c%10;
	if (lasta==lastb || lastb==lastc || lasta==lastc) {
	    return true;
	}
	else {
	    return false;
	}
    }
}
