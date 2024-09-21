class Solution {
    public String reverseVowels(String s) { 
        int n = s.length();
        char[] ch = s.toCharArray();
        int start = 0;
        int end = n-1;
        while(start<end){
            if(isVowel(ch[start])){
                if(isVowel(ch[end])){
                    char temp = ch[start];
                    ch[start] = ch[end];
                    ch[end] = temp;
                    start++;
                    end--;
                }else{
                    end--;
                }
            }else{
                start++;
            }
        }
        return String.valueOf(ch);
    }
    static boolean isVowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
            return true;
        }
        return false;
    }
}
