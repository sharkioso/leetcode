class Solution {
    public void rotate(int[] nums, int k) {
        for (int i=0;i<nums.length;i++){
            if(i+k<nums.length){
                nums[i+k]=nums[i];
            }
            else{
                nums[(i+k)%nums.length]=nums[i];
            }
        }
    }
}