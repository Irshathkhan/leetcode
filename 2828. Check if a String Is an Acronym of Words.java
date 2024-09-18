class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String temp = "";
		for(int i=0;i<words.size();i++) {
			temp += words.get(i).charAt(0);
		}
		return temp.equals(s)?true:false;
    }
}
