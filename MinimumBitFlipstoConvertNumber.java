class Solution {
    public int minBitFlips(int start, int goal) {
        String s = Integer.toBinaryString(start);
        String g = Integer.toBinaryString(goal);
        String temp = "";
        int count=0;
        if(s.length()>g.length()){
            count=s.length()-g.length();
            for(int i=0;i<count;i++){
                temp=0+temp;
            }
            temp += g;
            return diff(temp,s);
        }else{
            count=g.length()-s.length();
            for(int i=0;i<count;i++){
                temp=0+temp;
            }
            temp += s;
            return diff(temp,g);
        }
    }
    public int diff(String ms, String mg){
        int res=0;
        for(int i=0;i<ms.length();i++){
            if(ms.charAt(i)!=mg.charAt(i)){
                res++;
            }
        }
        return res;
    }
}
