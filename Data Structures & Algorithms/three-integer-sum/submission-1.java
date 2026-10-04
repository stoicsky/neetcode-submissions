class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //when we used 3 loops to get the 3 sum result we got time limit
        //becuase (3000)*3 bcz O(N3) thats 27 billion combinations/checks

        List<List<Integer>> result= new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){

            int left=i+1;
            int right=nums.length-1;

            while(left<right){
                if(nums[left]+nums[right]+nums[i]==0){
                    List<Integer>triplets=Arrays.asList(nums[left],nums[right],nums[i]);
                    if(!result.contains(triplets)){
                        result.add(triplets);

                    }
                    
                    left++;
                    right--;
                    
                }else if(nums[left]+nums[right]+nums[i]>0){
                    right--;
                }else{
                    left++;
                }

            }
        }
        return result;
        
    }
}
