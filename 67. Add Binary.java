import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        BigInteger c = new BigInteger(a,2);
		BigInteger d = new BigInteger(b,2);
		BigInteger sum = c.add(d);
		return (sum.toString(2));
    }
}
