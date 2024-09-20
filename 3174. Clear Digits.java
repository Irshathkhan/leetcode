class Solution {
    public String clearDigits(String s) {
        ArrayList<Character> list = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>96){
                list.add(s.charAt(i));
            }else{
                list.remove(list.size()-1);
            }
        }
        String res = "";
        for(int i=0;i<list.size();i++) {
			res+=list.get(i);
		}
		return res;
    }
}
