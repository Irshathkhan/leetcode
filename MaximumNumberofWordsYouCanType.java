class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] t=text.split(" ");
		String[] b=brokenLetters.split("");
        if(brokenLetters.length()==0) return t.length;
		int ans=t.length;
		for(int i=0;i<t.length;i++) {
			boolean flag=false;
			for(int j=0;j<b.length;j++) {
				if(t[i].contains(b[j])) {
					flag=true;
					break;
				}
			}
			if(flag) {
				ans--;
			}
		}
		return ans;
    }
}
