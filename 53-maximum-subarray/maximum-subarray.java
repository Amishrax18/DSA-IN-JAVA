class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            //step 1->
            sum=sum+nums[i];
            //step-2->
            if(sum>maxi){
                maxi=sum;
            }
            
            //step}-3->
            if(sum<0){
                sum=0;
            }
        }
        return maxi;
        
    }
}