class Solution {
    public int findComplement(int num) {
        String a = Integer.toBinaryString(num);
		String temp = "";
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)=='0') {
				temp +=1;
			}else {
				temp +=0;
			}
		}
		return Integer.parseInt(temp,2);
    }
}
