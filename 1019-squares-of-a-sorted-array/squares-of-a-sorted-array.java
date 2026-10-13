class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=nums[i]*nums[i];
        }
        int head=0;
        int tail=n-1;
        for(int pos=n-1;pos>=0;pos--){
            if(nums[head]>nums[tail]){
                ans[pos]=nums[head];
                head++;
            }
            else{
                ans[pos]=nums[tail];
                tail--;
            }
        }
        return ans;
        
    }
}