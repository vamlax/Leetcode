class Solution {
    public int[] getConcatenation(int[] nums) {
        int i,j;
        int n = nums.length;
        int ans[] = new int[2*n];
        for(i = 0; i < n; i++)
        {   
            ans[i+n] = ans[i] = nums[i];
            
        }
        // for(i = 0; i < 2*n; i++)
        // {   if(i<(2*n-1))
        //     {
        //         System.out.print(ans[i]+",");
        //     }
        //     else
        //     {
        //       System.out.print(ans[i]);  
        //     }
        // }
    return ans;
    }
}