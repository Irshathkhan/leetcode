class Solution {
    public int lengthOfLastWord(String st) {
        String s =st.trim();
        String temp ="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                temp="";
                continue;
            }else{
                temp += s.charAt(i);
            }
        } 
        return temp.length();
    }
}
