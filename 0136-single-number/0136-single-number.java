class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int i,c=0;
        if(n==1){
            return nums[0];
        }
        Arrays.sort(nums);
        
        for(i = 0; i<n-1 ;i+=2){
            
            c=nums[i];
            if(c!=nums[i+1]){
                break;
            }
        }
            return nums[i];
       
    }
}