

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

