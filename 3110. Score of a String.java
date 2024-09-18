class Solution {
    public int scoreOfString(String s) {
        int sum =0;
		for(int i=0;i<s.length()-1;i++) {
		  int res = s.charAt(i) - s.charAt(i+1);
		  sum += Math.abs(res);
		}
		return sum;
    }
}
