class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int a = 0, count = 0;
       for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                a = nums[i];
            }
            if (nums[i] == a) {
                count++;
            } else {
                count--;
            }
        }

        return a;
    }
}