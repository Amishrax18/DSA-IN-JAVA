import java.util.*;
public class rotateArray{
 public static void rotateArr(int arr[], int d) {
        // code here
        int n=arr.length;
        d=d%n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }
    static void reverse(int arr[],int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

public static void main(String args[]){
    int arr[]={2,4,1,3,5,8};
    int d=3;
    rotateArr(arr,d);
    for(int ele : arr)
    System.out.print(ele+" ");
}
}