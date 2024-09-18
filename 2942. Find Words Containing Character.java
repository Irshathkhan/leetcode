class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<words.length;i++) {
			String s="";
			s+=x;
			if(words[i].contains(s)) {
				al.add(i);
			}
		}
		return al;
    }
}
