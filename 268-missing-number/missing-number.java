class Solution {
    public int missingNumber(int[] nums) {
       int n=nums.length;

       //Rangesum=0;
       int rangesum=0;
       for(int i=0;i<=n;i++){
        rangesum+=i;
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        int missingNo=rangesum-sum;
        return missingNo;
    }
}