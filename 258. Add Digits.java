class Solution {
    public int addDigits(int num) {
        if(num < 10) return num;
        int temp = num;
        int res = 0;
        while(num!=0){
            temp = num%10;
            res += temp;
            num /= 10; 
        }
        return addDigits(res);
    }
}
