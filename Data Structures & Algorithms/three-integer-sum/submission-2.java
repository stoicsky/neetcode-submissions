class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        List<List<Integer>> result= new ArrayList<>();

        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
                int l=i+1;
                int r=n-1;
                while(l<r){
                    int sum=nums[i]+nums[l]+nums[r];
                    // if(nums[l]==nums[l-1]){
                    //     continue;
                    // }
                    if(sum==0){
                        List<Integer>triplets=Arrays.asList(nums[i],nums[l],nums[r]);
                        
                        result.add(triplets);
                        
                        l++;
                        r--;
                        while(l<r&&nums[l]==nums[l-1]){
                            l++;
                        }
                        while(l<r&& nums[r]==nums[r+1]){
                            r--;
                        }
                    }else if(sum>0){
                        r--;
                    }else{
                        l++;
                    }
                }
            }
        return result;

    }
}
