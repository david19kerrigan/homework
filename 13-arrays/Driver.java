public class Driver{
	public int[] frontPiece(int[] nums) {
  		if(nums.length<3){
   			return nums;
  		}
  		else{
   			return new int[] {nums[0],nums[1]};
  		}
	}
	public int sum13(int[] nums) {
  		int ans=0;
  
  		for(int i = 0; i<nums.length; i++){
   			if(nums[i]!=13){
    				if(i!=0){
     					if(nums[i]!=13){
      						ans+=nums[i];
     					}
    				}
    				if(i==0){
     					ans+=nums[i];
    				}
   			}
  		}
  
   /*if(nums[i]==13){
    return ans;
   }*/
  
	return ans;
	}
	




}

	
		
