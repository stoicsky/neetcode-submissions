class Solution {
    public int[] twoSum(int[] nums, int target) {
        //use hashmap
        HashMap<Integer,Integer>mp= new HashMap<Integer,Integer>();
        int[] result= new int[2];
        for(int i=0;i<nums.length;i++){
            int needed=target-nums[i];

            if(mp.containsKey(needed)){
                result[0]=mp.get(needed);
                result[1]=i;
            }
            mp.put(nums[i],i);
        }
        return result;

    }
}
