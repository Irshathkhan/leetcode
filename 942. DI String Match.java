class Solution {
    public int[] diStringMatch(String s) {
        int I =0;
		int D = s.length();
		int[] n = new int[D+1];
		int sum = ((s.length())*(s.length()+1))/2;
		int res = 0;
		for(int i=0;i<n.length-1;i++) {
			if(s.charAt(i)=='D') {
				n[i] = D;
				res += D; 
				D--;
			}else {
				n[i] = I;
				res += I;
				I++;
			}
		}
		n[n.length-1]=sum-res;

        return n;
    }
}
