class Solution {
    public void sortColors(int[] nums) {
        //DUTH NATIONAL FLAG ALGO
        /*
We maintain three pointers:
- low: Position where the next 0 should go.
- mid: Current element we are processing.
- high: Position where the next 2 should go.
        */

        int low=0;
        int mid=0;
        int high=nums.length-1;

        while(mid<=high){
            if(nums[mid]==1){
                mid++;
            }else if(nums[mid]==0){

                //swap with low and mid
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;

                low++;
                mid++;
            }else{
                int temp1=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp1;
                high--;
            }
        }
    }
}