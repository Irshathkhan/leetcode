class Solution {
    public String reversePrefix(String word, char ch) {
        char[] res = word.toCharArray();
        int start = 0;
        int end = word.indexOf(ch);
        while(start<end){
            char temp = res[start];
            res[start] = res[end];
            res[end] = temp;
            start++;
            end--;
        }
        return String.valueOf(res);
    }
}
