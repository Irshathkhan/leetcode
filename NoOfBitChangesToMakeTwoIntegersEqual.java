class Solution {
    public int minChanges(int n, int k) {
    String n1 = Integer.toBinaryString(n);
		String k1 = Integer.toBinaryString(k);
		int diff = Math.abs(n1.length() - k1.length());
		if (n1.length() == k1.length()) {
        return m1(n1, k1);
			
		} else if (n1.length() > k1.length()) {
			for (int i = 0; i < diff; i++) {
				k1 = "0" + k1;
			}
        return m1(n1, k1); 
			
		} else {
			for (int i = 0; i < diff; i++) {
				n1 = "0" + n1;
			}
			return m1(n1, k1);
		} 
    }
	static int m1(String n1, String k1) {
		int count = 0;
		for (int i = n1.length() - 1; i >= 0; i--) {
			if (n1.charAt(i) != k1.charAt(i)) {
				if(n1.charAt(i)=='0' && k1.charAt(i)=='1') {
			        return -1;
			    }
				else {
					count++;
				}
			}
		}
		return count;
    }
}
