class Solution {
    public int countSeniors(String[] s) {
        int count=0;
		for(int i=0;i<s.length;i++) {
			String temp=s[i].substring(11,13);
			int k=Integer.parseInt(temp);
			if(k>60) {
				count++;
			}
		}
        return count;
    }
}
