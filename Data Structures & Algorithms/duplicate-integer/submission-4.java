class Solution {
    public boolean hasDuplicate(int[] nums) {
        //two pointer
        Arrays.sort(nums);
        int i=0,j=1;

        while(j<nums.length){
            if(nums[i]==nums[j]){
                return true;
            }else{
                i++;
                j++;
            }
        }
        return false;

        
    }
}