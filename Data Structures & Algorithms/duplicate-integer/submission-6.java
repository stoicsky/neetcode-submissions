class Solution {
    public boolean hasDuplicate(int[] nums) {
        //Java provides wrapper classes like Integer,Double,,Boolean etc..
        HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        // for(Integer i:map.keySet()){
        //     if(map.get(i)>1){
        //         return true;
        //     }
        // }

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>1){
                return true;
            }

        }
        return false;
        
    }
}