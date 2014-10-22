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
  