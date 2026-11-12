class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[]result=new int[k];
        Map<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        
        }
        List<Map.Entry<Integer,Integer>>lis=new ArrayList<>(map.entrySet());
        lis.sort((a,b)->b.getValue()-a.getValue());

        for(int i=0;i<k;i++){
            result[i]=lis.get(i).getKey();
        }
        return result;

        //let me create one map and then we can store the count in it.

        

        //Solution 1 -Aakash create one list that will convert the map into list and it will
        //store the key-value pair in one entry

        /*
Important conversions to remember for DSA
From	To	Code
List	ArrayList	new ArrayList<>(list)
Set	   ArrayList	new ArrayList<>(set)
Map keys	ArrayList	new ArrayList<>(map.keySet())
Map values	ArrayList	new ArrayList<>(map.values())
Map entries	ArrayList	new ArrayList<>(map.entrySet())
Array	List	new ArrayList<>(Arrays.asList(arr))
Stream	ArrayList	collect(Collectors.toCollection(ArrayList::new))
 */

        

        /*
        In how many ways we can sort a list
        1. Collections.sort(lis,(a,b)->b.getValue()-a.getValue());
        2. lis.sort(Comparator.comparing(Map.Entry<Integer,Integer>::getValue).reversed());
        3. lis.sort(
    Comparator.comparingInt(
        (Map.Entry<Integer, Integer> e) -> e.getValue()
    ).reversed()
);
        4. Anonymous Comparator Class
        Collections.sort(lis, new Comparator<Map.Entry<Integer, Integer>>() {
        @Override
        public int compare(
        Map.Entry<Integer, Integer> a,
        Map.Entry<Integer, Integer> b
        ) {
        return Integer.compare(b.getValue(), a.getValue());
    }
});
        */
        


    }
}
