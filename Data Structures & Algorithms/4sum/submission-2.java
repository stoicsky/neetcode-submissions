class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        //O(N*N*N)
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int left=j+1;
                int right=n-1;
                while(left<right){
                    long sum=(long)nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum==target){
                        List<Integer>lis=Arrays.asList(nums[i],nums[j],nums[left],nums[right]);
                        if(!result.contains(lis)){
                            result.add(lis);
                        }
                        
                        left++;
                        right--;

                    } else if(sum>target){
                        right--;
                    }else{
                        left++;
                    }
                }
            }
        }
        return result; // This solution will give me duplicate quadruplets.
    }
}