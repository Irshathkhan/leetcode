class Solution {
    public String reverseWords(String s) {
        String[] a=s.split("\\s+");
		String ans="";
		for(int i=0;i<a.length;i++) {
			for(int j=a[i].length()-1;j>=0;j--) {
				ans+=a[i].charAt(j);
			}
			if(i<a.length-1) ans+=" ";
		}
		return ans;
    }
}
