class Solution {
    public int[] twoSum(int[] nums, int target) {
        //sorting + 2 pointers
        int[] result=new int[2];
        Arrays.sort(nums);
        int sum=0;
        int i=0;
        int j=nums.length-1;

        while(i<j){
            sum=nums[i]+nums[j];
            if(sum==target){
                result[0]=i;
                result[1]=j;
                break;
            }else if(sum<target){
                i++;
            }else{
                j--;
            }
        }
        return result;
    }
}
