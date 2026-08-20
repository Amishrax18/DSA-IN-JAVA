class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        int s=0;
        int e=n-1;

        while(s<=e){
            int mid=s+(e-s)/2;
            //single elemnt
            if(s==e){
                return nums[s];
            }
            //non single element
            int currentValue=nums[mid];
            int previousValue=-1;
            if(mid-1>=0){
                previousValue=nums[mid-1];
            }
            int nextValue=-1;
            if(mid+1<n){
                nextValue=nums[mid+1];
            }
            if(currentValue!=previousValue && currentValue!=nextValue){
                return currentValue;
            }
            if(currentValue!=previousValue && currentValue==nextValue){
                int startingIndexOfPair= mid;
                if((startingIndexOfPair & 1)==1){
                    e=mid-1;
                    }
                else{
                    s=mid+1;
                }
            }
                if(currentValue==previousValue && currentValue!=nextValue){
                    int endingIndexOfPair=mid;
                    if((endingIndexOfPair & 1) == 1){
                    s=mid+1;
                    }
                else{
                    e=mid-1;
                }
                }

            }


        

        return -1;

        
    }
}