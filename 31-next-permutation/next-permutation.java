class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int gola_index=-1;
        for(int i=n-1;i>=1;i--){
            if(nums[i-1]<nums[i]){
                gola_index=i-1;
                break;
            }
        }
        if(gola_index!=-1){
            for(int j=n-1;j>gola_index;j--){
                if(nums[j]>nums[gola_index]){
                    int temp=nums[j];
                    nums[j]=nums[gola_index];
                    nums[gola_index]=temp;
                    break;
                }
            }
        }
        //reverse kr do gola indx ke aage waale elements ko
            int left=gola_index+1;
            int right=n-1;
            while(left<right){
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++;
                right--;
            }        
                    
         }
}