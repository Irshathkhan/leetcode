class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum =0;
        int res =0;
        int sfgjfrewq err4ftcdew    
		for(int i=0;i< nums.length;i++) {
			int n = nums[i];
			int max =0;
			while(n!=0) {
				int ld = n%10;
				if(max<ld) {
					max = ld;
				}
				n /= 10;
			}
			for(int j=0;j<count;j++) {
				res = res*10+1;
			}
			max = max*res;
			sum = sum +max;
		}
		return sum;
    }
}
