class Solution {
    public int countConsistentStrings(String ad, String[] arr) {
         HashSet<Character> ch = new HashSet<>();
        for (char c : ad.toCharArray()) {
            ch.add(c);
        }
        
        int count = 0;
        
        for (String str : arr) {
            boolean is_true = true;
            for (char c : str.toCharArray()) {
                if (!ch.contains(c)) {
                    is_true = false;
                    break;
                }
            }
            if (is_true) {
                count++;
            }
        }
        
        return count;
    }
}
