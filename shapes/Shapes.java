public class Shapes{
	public String tri1(int d){
		String result = "";
		int r = 1;
		for(int currentD =0; currentD<d; currentD++){
			for(int currentR = 0; currentR<r; currentR++){
			       result+="*";
			}
	 		result+="\n";
		}
		return result;
	}
	public String tri2(int d){
		String result = "";
		int r = 1;
		for(int currentD =0; currentD<d; currentD++){
			for(int currentR = 0; currentR<r; currentR++){
			        int empties = r-currentR;
				for(int i = 0; i<empties; i++){
					result+="";
				}
				result+="*";
			}
	 		result+="\n";
		}
		return result;
	}
	 
}	