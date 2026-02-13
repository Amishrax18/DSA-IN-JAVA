import java.util.*;
public class maxSubarraySum{
    public static void maxSubarraySum(int numbers[]){
        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                currentSum=0;
                for(int k=start;k<=end;k++){
                    currentSum+=numbers[k];
                }
                   System.out.println(currentSum);
                if(maxSum<currentSum){
                    maxSum=currentSum;
                }

            }
        }
        System.out.println("maxsum="+maxSum);

    }
    
    public static void main(String args[]){
        int numbers[]={3,4,2,5,1,6};
        maxSubarraySum(numbers);
    }
}