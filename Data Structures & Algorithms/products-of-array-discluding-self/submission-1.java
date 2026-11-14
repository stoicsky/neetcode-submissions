class Solution {
    public int[] productExceptSelf(int[] nums) {
        //brute force approach
        //Take one integer variable and store the prodcut of all elemetns and then in result give by diving it.

        int product=1;
        int zeroCount=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zeroCount++;
            }else if(zeroCount<=1){
                product=product*nums[i];
            }
            
        }

        int[] result=new int[nums.length];
        if(zeroCount>1){
            return result;
        }

        for(int i=0;i<nums.length;i++){
            if(zeroCount==0){
                result[i]=product/nums[i];
            }else{
                result[i] = (nums[i] == 0) ? (int) product : 0;
            }
            
        }
        return result;
    }
}  
