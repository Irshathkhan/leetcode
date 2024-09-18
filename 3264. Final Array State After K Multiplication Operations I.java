class Solution {
    public int[] getFinalState(int[] nums, int k, int m) {
        int min;
        int ind;
        while(k>0){
			min = Integer.MAX_VALUE;
			ind = 0;
			for (int i = 0; i < nums.length; i++) {
				if (min > nums[i]) {
					min = nums[i];
					ind = i;
				}
			}
			nums[ind] = min * m;
			k--;
		}
		return nums;
    }
}
