class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        List<Integer> lis=new ArrayList<>();

        HashMap<Integer,Integer>mp=new HashMap<Integer,Integer>();

        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
            if(entry.getValue()>n/3){
                lis.add(entry.getKey());
            }
        }
        return lis;
        
    }
}