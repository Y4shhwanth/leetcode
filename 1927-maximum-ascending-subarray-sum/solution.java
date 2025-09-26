class Solution {
    public int maxAscendingSum(int[] nums) {
        int max_sum = nums[0] , cur_sum = nums[0];
        for(int i =1; i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                cur_sum += nums[i];
            }
            else{
                max_sum = Math.max(max_sum,cur_sum);
                cur_sum=nums[i];
            }
        }
        return Math.max(max_sum , cur_sum);
    }
}
