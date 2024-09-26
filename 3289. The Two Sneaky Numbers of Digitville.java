class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int k = 0;
        int[] res = new int[2];
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length-1 ; i++){
            if(nums[i] == nums[i+1]){
                res[k++] = nums[i];
            }
        }
        return res;
    }
}
