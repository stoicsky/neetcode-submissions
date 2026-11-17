class Solution {
    public int[] productExceptSelf(int[] nums) {
        //we can do it by taking prefix prodcut in one array- product of elements o its left
        //we can take another array which is suffix array- product of elements to right

        int[] leftProduct=new int[nums.length];
        int[] rightProduct= new int[nums.length];
        int[] result=new int[nums.length];

        /*
        Index	nums[i]	Left product
           0	1	      1
           1	2	      1
           2	3	      1 × 2 = 2
           3	4	      1 × 2 × 3 = 6
        */

        

        leftProduct[0]=1;

        for(int i=1;i<nums.length;i++){
            leftProduct[i]=leftProduct[i-1]*nums[i-1];
        }
        
        /*
        Index	nums[i]	Right product
           0	1	    2 × 3 × 4 = 24
           1	2	    3 × 4 = 12
           2	3	    4
           3	4	    1
        */
        rightProduct[nums.length-1]=1;

        for(int i=nums.length-2;i>=0;i--){
            rightProduct[i]=rightProduct[i+1]*nums[i+1];
        }

        //product of numbers
        for(int i=0;i<result.length;i++){
            result[i]=leftProduct[i]*rightProduct[i];
        }
        return result;
        
    }
}  
