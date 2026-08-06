class Solution {
    public int maxSubArray(int[] nums) {
         int i;
        int n = nums.length;
        int ms = Integer.MIN_VALUE;
        int cs=0;
        int count=0;
        int max = nums[0];
        for(i=0;i<n;i++){
            if(nums[i]<0){
                count++;
            }
            else{
                break;
            }
        }

        if(count==n){
            for(i=1;i<n;i++){
                if(nums[i]>max){
                    max = nums[i];
                }
            }
            return max;
        }

        else{ 
            for(i=0;i<n;i++){
                cs += nums[i];
                if(cs<0){
                    cs = 0;
                }
                ms = Math.max(cs,ms);
            }
            return ms;
        }
    }

}