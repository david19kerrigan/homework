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
	public String tri3(int h){
		String result="";
		int r = 1;
		for(int currentH = 1; currentH<h; currentH++){
			for(int currentR = 1; currentR<r; currentR++){
				if((r-currentR)%2!=0){
					int empties = (r-currentR)/2-.5;
				}
				else{

					int empties = (r-currentR)/2;
				}
				for(int i = 0; i<empties; i++){
					result+=(" ");
				}
				result+="*";
				for(int i = 0; i<empties; i++){
					result+=(" ");
				}
			}
			result+=("\n");
			r+=1
		}
	}
	public String diamond(int h){
		String result="";
		int mid = h/2;
		int r = 1;
		for(int currentH = 1; currentH<h; currentH++){
				
			if(currentH<mid){
				for(int currentR =1; currentR<mid; currentR++){
					if((mid-currentR)%2!=0){
						int empties = (r-currentR)/2-.5;
					}
					else{

						int empties = (r-currentR)/2;
					}
					for(int i = 0; i<empties; i++){
						result+=(" ");
					}
					result+="*";
					for(int i = 0; i<empties; i++){
						result+=(" ");
					}
				}
			}
			if(currentH>mid){

				for(int currentR = 1; currentR<r; currentR-=1){
					if((mid-currentR)%2!=0){
						int empties = (r-currentR)/2-.5;
					}
					else{

						int empties = (r-currentR)/2;
					}
					for(int i = 0; i<empties; i++){
						result+=(" ");
					}
					result+="*";
					for(int i = 0; i<empties; i++){
						result+=(" ");
					}
				}
			}
				
		}
		return result;
	}
	public String tri4(int h){
		String result = "";
		int r = h;
		for(int currentD =0; currentD<d; currentD-=1){
			for(int currentR = 0; currentR<r; currentR++){
			        int empties = r-currentR;
				for(int i = 0; i<empties; i++){
					result+="";
				}
				result+="*";
			}
	 		result+="\n";
			r-=1;
		}
		return result;
	}


	
}	
	
