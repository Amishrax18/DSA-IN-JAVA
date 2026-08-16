class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int majority=nums[0];
        int votes=1;
        for(int i=1 ; i<n;i++){
            if(votes==0){
                majority=nums[i];
                votes++;
            }
            else if(majority != nums[i]){
                
                votes--;
                
            }
            else{
                //majority==nums[i]
                    votes++;
            }

        }
        return majority;
        
    }
}