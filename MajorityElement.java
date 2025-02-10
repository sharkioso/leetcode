package leetcode;
class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int majorElem = 0;
        for (int i=0;i<nums.length;i++){
            if (count==0){
                majorElem=nums[i];
            }
            if (nums[i]==majorElem){
                count++;
            }
            else{
                count--;
            }
        }
    return majorElem;
    }
}