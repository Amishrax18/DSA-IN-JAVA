import java.util.*;
public class twoSum {
    public static boolean twoSum(int arr[], int target) {
        Arrays.sort(arr);
        int n=arr.length;
        int i=0,j=n-1;
        while(i<j){
            if(arr[i]+arr[j]==target) return true;
            else if(arr[i]+arr[j]<target)i++;
            else if(arr[i]+arr[j]>target)j--;
        }
        return false;
        
    }
    public static void main(String args[]){
        int arr[]={1,6,3,2,9,5};
        int target=15;
        twoSum(arr,target);
        boolean result = twoSum(arr, target);
        System.out.println(result);
    }
}