class Solution {
    public boolean isPalindrome(int x) {
		int c = x;
        int rev =0;
        boolean flag=false;
        
        while(x!=0){
            int ld = x%10;
            rev = rev*10 + ld;
            x /= 10;
        }
        if(rev==c){
            flag=true;
        } 
        if(c<0){
            flag=false;;
        }
        return flag;
    }
}
