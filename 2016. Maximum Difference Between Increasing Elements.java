class Solution {
    public int maximumDifference(int[] nums) {
        int l = nums.length;
        int maxDif= 0;
        int dif = nums[0];
        for(int i=1;i<l;i++){
           if(nums[i]<dif){
                dif = nums[i];
           }else if(nums[i]-dif>maxDif) {
				maxDif = nums[i]-dif; 
			}
        }
        return maxDif==0?-1:maxDif;
    }
}
