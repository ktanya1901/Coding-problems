class Solution {
    public int findMin(int[] nums) {
        int min = nums[0];
        for(int n = 0; n < nums.length; n++){
            if(nums[n] < min)
                min = nums[n];
        }

        return min;

    }
}