class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[]result=new int[k];

        //let me create one map and then we can store the count in it.

        Map<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        
        }

        //Solution 1 -Aakash create one list that will convert the map into list and it will
        //store the key-value pair in one entry

        List<Map.Entry<Integer,Integer>>lis=new ArrayList<>(map.entrySet());
        lis.sort((a,b)->b.getValue()-a.getValue());

        for(int i=0;i<k;i++){
            result[i]=lis.get(i).getKey();
        }
        return result;


    }
}
