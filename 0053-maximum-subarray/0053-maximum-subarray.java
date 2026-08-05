class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int ms=Integer.MIN_VALUE;
        int cs=0;
        int count =0;
        for(int i =0 ; i<n;i++){
            if(nums[i]<0){
                count++;
            }
        }
        if(count==n){
            Arrays.sort(nums);
            return nums[n-1];
        }
        else{
        for(int i = 0; i < n; i++){
            cs=cs+nums[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        return ms;
        }
    }
}