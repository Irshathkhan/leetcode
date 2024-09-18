class Solution {
    public int romanToInt(String s) {
         char[] c = { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };
		int[] in = { 1, 5, 10, 50, 100, 500, 1000 };
		int[] ar = new int[s.length()];
		int sum = 0;
		int h = 0;
		for (int i = 0; i < s.length(); i++) {
			int temp = 0;
			for (int j = 0; j < in.length; j++) {
				if (s.charAt(i) == c[j]) {
					ar[i]+=in[j];
				}
			}
		}
		for(int i=0;i<ar.length-1;i++) {
			if(ar[i]>=ar[i+1]) {
				sum += ar[i];
			}else {
				sum -= ar[i];
			}
			
		}
        return (sum+ar[ar.length-1]);
    }
}
