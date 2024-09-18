class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        long temp[] = new long[n*(n+1)/2];
        int mod = 1000000007;
		int ind =0;
		long sum=0;
		for(int i=0;i<nums.length;i++) {
			sum = 0;
			for(int j=i;j<nums.length;j++) {
				temp[ind] = sum+nums[j];
				sum = temp[ind++];
			}
		}
		sum=0;
		Arrays.sort(temp);
		for(int i=left-1;i<right;i++) {
			sum += temp[i];
		}
        return (int)(sum%mod); 
    }
}
