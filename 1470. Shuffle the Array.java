class Solution {
    public int[] shuffle(int[] nums, int n) {
        int t = nums.length;
        int res[] = new int[t];
        int j = 0;
        for (int i = 0; i < t; i++) {
            res[i] = nums[j++];
            res[++i] = nums[n++];
        }
        return res;
    }
}
