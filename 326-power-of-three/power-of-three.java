class Solution {
    public boolean isPowerOfThree(int n) {
        // if(n<=0){
        //     return false;
        // }
        // if(n==1){
        //     return true;
        // }
        // int temp=1;
        // for(int i=1;i<=30;i++){
        //     temp*=3;
        //     if(temp==n){
        //         return true;
        //     }
        // }
        // return false;

        //RECURSIVE APPROACH
        if(n==1){
            return true;
        }
        if(n%3!=0 || n<=0){
            return false;
        }
        return isPowerOfThree(n/3);

    }
}