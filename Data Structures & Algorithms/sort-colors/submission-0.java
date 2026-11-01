class Solution {
    public void sortColors(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        
    }

    private void mergeSort(int[] nums,int left, int right){
        if(left>=right){
            return; // base condition
        }
        int mid=(left+right)/2;
        mergeSort(nums,left,mid);
        mergeSort(nums,mid+1,right);

        merge(nums,left,mid,right);

    }

    private void merge(int[] nums,int left,int mid,int right){
        int i=left;  //till mid
        int j=mid+1; //till right
        int k=0;

        //create one temp array
        int[] temp=new int[right-left+1];

        while(i<=mid && j<=right){
            if(nums[i]<=nums[j]){
                temp[k]=nums[i];
                i++;
            }else{
                temp[k]=nums[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k]=nums[i];
            i++;
            k++;

        }
        while(j<=right){
            temp[k]=nums[j];
            j++;
            k++;
        }
        for(int p=0;p<temp.length;p++){
            nums[left+p]=temp[p];
        }
    }
}