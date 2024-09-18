class Solution {
    public String[] findRelativeRanks(int[] s) {
        int t = s.length;
        String[] res = new String[t];
        int[] temp = s.clone();
        Arrays.sort(temp);
        Map<Integer, String> mp = new HashMap<>();
        for (int i = 0; i < t; i++) {
            if (i == t - 1) {
                mp.put(temp[i], "Gold Medal");
            } else if (i == t - 2) {
                mp.put(temp[i], "Silver Medal");
            } else if (i == t - 3) {
                mp.put(temp[i], "Bronze Medal");
            } else {
                mp.put(temp[i], t - i + "");
            }
        }

        for (int i = 0; i < s.length; i++) {
            res[i] = mp.get(s[i]);
        }
        return res;
    }
}
