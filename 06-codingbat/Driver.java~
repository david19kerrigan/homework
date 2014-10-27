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

public int stringMatch(String a, String b) {
  int n = 0;
  for(int i = 0; i<a.length()-2; i++){
   if(a.substring(i,i+1)==b.substring(i,i+1)){
    n++;
   }
  }
  return n;
}

public String stringYak(String str) {
  if(str.contains("yak")){
   for(int i = 0; i<str.length()-3; i++){
    int n = i+3;
    if(str.substring(i,n).equals("yak")){
     return(str.substring(0,i)+str.substring(n,str.length()));
    }
   }
  }
  return "a";
}

public String stringBits(String str) {
  int n = 0;
  String r = "";
  while(n<str.length()){
   r+=str.charAt(n);
   n+=2;
  }
  return r;
  
  
}

public String frontTimes(String str, int n) {
  if(str.length()<3){
   int a = 0;
   String r = "";
   while(a<n){
    r = r+str;
    a++;
   }
   return r;
  }
  else{
   int b = 0;
   String d = "";
   while(b<n){
    d = d+str.substring(0,3);
    b++;
   }
   return d;
  }
  return "a" ;
 }
