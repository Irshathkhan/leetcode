class Solution {
    public boolean lemonadeChange(int[] a) {
        int in =0;
        for(int i =0;i<a.length;i++){
            if(a[i] == 5){
                in += 5;
            }else if(a[i] == 10){
                if(a[i]>=10){
                    in -= 5;
                }else{
                    return false;
                }
            }else if(a[i]==20){
                if(a[i]>=20){
                    in -= 15;
                }else{
                    return false;
                }
            }
        }if(in<0){
            return false;
        }else{
            return true;
        }
    }
}
