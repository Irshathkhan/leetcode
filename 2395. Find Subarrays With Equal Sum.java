class Solution {
    public boolean findSubarrays(int[] nums) {
        ArrayList list = new ArrayList<>();
        int sum = nums[0] + nums[1];
        list.add(sum);
        for(int i=2;i<nums.length;i++){
            sum=nums[i]+nums[i-1];
            if(list.contains(sum)) {
                return true;
           }else{
                list.add(sum);
           }
        }
        return false;
    }
}
