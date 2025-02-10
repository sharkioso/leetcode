package leetcode;

class Solution {
    public void rotate(int[] nums, int k) {
        if (nums.length % k != 0) {
            int i = 0;
            int rem = nums[i + k];
            int otherRem=0;
            nums[i + k] = nums[i];
            int count=0;
            while (true) {
                if (count==0){
                    otherRem=nums[(i + k) % nums.length];
                    nums[(i + k) % nums.length] = rem;        
                }
                else{
                    rem = nums[(i + k) % nums.length];
                    nums[(i + k) % nums.length] = rem;
                    i += k;
                    i = i % nums.length;
                }
                if (i == 0) {
                    break;
                }
            }
        }
    }
}

// -1 -100 3 99