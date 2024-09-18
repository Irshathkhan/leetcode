class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        Arrays.sort(sc);
        Arrays.sort(tc);
        int count = 0;
        for (int i = 0; i < sc.length; i++) {
            if (sc[i] == tc[i]) {
                count++;
            }
        }
        if (count == s.length()) {
            return true;
        }
        return false;
    }
}
