class Solution {
    public int[] runningSum(int[] nums) {
        int i,sum=0;
        int n = nums.length;
        int runningsum[] = new int[n];
        for(i = 0; i < n; i++)
        {   
            sum = sum + nums[i];
            runningsum[i] = sum;
        }
    return runningsum;
    }
}